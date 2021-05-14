package com.josh.smartkettlebell.util;

public class AHRS {
    public float[] Quaternion;
    float sampleRate;
    float Beta;
    private float roll, pitch, yaw;

    public AHRS(float sampleRate, float beta) {
        this.sampleRate = sampleRate;
        this.Beta = beta;
        Quaternion = new float[]{1f, 0f, 0f, 0f};
    }

    public float[] Update(float[] acc, float[] gry) {
        float ax = acc[0];
        float ay = acc[1];
        float az = acc[2];

        float pi180 = (float) Math.PI / 180;//deg to rad
        float gx = gry[0] * pi180;
        float gy = gry[1] * pi180;
        float gz = gry[2] * pi180;

        float q1 = Quaternion[0], q2 = Quaternion[1], q3 = Quaternion[2], q4 = Quaternion[3];   // short name local variable for readability
        float norm;
        float s1, s2, s3, s4;
        float qDot1, qDot2, qDot3, qDot4;

        // Auxiliary variables to avoid repeated arithmetic
        float _2q1 = 2f * q1;
        float _2q2 = 2f * q2;
        float _2q3 = 2f * q3;
        float _2q4 = 2f * q4;
        float _4q1 = 4f * q1;
        float _4q2 = 4f * q2;
        float _4q3 = 4f * q3;
        float _8q2 = 8f * q2;
        float _8q3 = 8f * q3;
        float q1q1 = q1 * q1;
        float q2q2 = q2 * q2;
        float q3q3 = q3 * q3;
        float q4q4 = q4 * q4;

        // Normalise accelerometer measurement
        norm = (float) Math.sqrt(ax * ax + ay * ay + az * az);
        if (norm == 0f) return new float[]{roll, pitch, yaw}; // handle NaN
        norm = 1 / norm;        // use reciprocal for division
        ax *= norm;
        ay *= norm;
        az *= norm;

        // Gradient decent algorithm corrective step
        s1 = _4q1 * q3q3 + _2q3 * ax + _4q1 * q2q2 - _2q2 * ay;
        s2 = _4q2 * q4q4 - _2q4 * ax + 4f * q1q1 * q2 - _2q1 * ay - _4q2 + _8q2 * q2q2 + _8q2 * q3q3 + _4q2 * az;
        s3 = 4f * q1q1 * q3 + _2q1 * ax + _4q3 * q4q4 - _2q4 * ay - _4q3 + _8q3 * q2q2 + _8q3 * q3q3 + _4q3 * az;
        s4 = 4f * q2q2 * q4 - _2q2 * ax + 4f * q3q3 * q4 - _2q3 * ay;
        norm = 1f / (float) Math.sqrt(s1 * s1 + s2 * s2 + s3 * s3 + s4 * s4);    // normalise step magnitude
        s1 *= norm;
        s2 *= norm;
        s3 *= norm;
        s4 *= norm;

        // Compute rate of change of quaternion
        qDot1 = 0.5f * (-q2 * gx - q3 * gy - q4 * gz) - Beta * s1;
        qDot2 = 0.5f * (q1 * gx + q3 * gz - q4 * gy) - Beta * s2;
        qDot3 = 0.5f * (q1 * gy - q2 * gz + q4 * gx) - Beta * s3;
        qDot4 = 0.5f * (q1 * gz + q2 * gy - q3 * gx) - Beta * s4;

        // Integrate to yield quaternion
        q1 += qDot1 / sampleRate;
        q2 += qDot2 / sampleRate;
        q3 += qDot3 / sampleRate;
        q4 += qDot4 / sampleRate;
        norm = 1f / (float) Math.sqrt(q1 * q1 + q2 * q2 + q3 * q3 + q4 * q4);    // normalise quaternion
        Quaternion[0] = q1 * norm;
        Quaternion[1] = q2 * norm;
        Quaternion[2] = q3 * norm;
        Quaternion[3] = q4 * norm;

        //calculate angles
        float q0 = Quaternion[0];
        q1 = Quaternion[1];
        q2 = Quaternion[2];
        q3 = Quaternion[3];
        pi180 = 1 / pi180;
        roll = (float) Math.atan2(q0 * q1 + q2 * q3, 0.5f - q1 * q1 - q2 * q2) * pi180;
        pitch = (float) Math.asin(-2.0f * (q1 * q3 - q0 * q2)) * pi180;
        yaw = (float) Math.atan2(q1 * q2 + q0 * q3, 0.5f - q2 * q2 - q3 * q3) * pi180;

        return new float[]{roll, pitch, yaw};
    }
}
