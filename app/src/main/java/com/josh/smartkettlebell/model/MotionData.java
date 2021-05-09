package com.josh.smartkettlebell.model;

public class MotionData {
    float[] data;
    long timestamp;

    public MotionData(float[] data, long timestamp) {
        this.data = data;
        this.timestamp = timestamp;
    }

    public float[] getData() {
        return data;
    }

    public void setData(float[] data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
