package com.josh.smartkettlebell.util;

public class LowPassFilter {
    final float ALPHA = 0.5f;
    float gravity = 0f;

    public float next(float nextValue) {
        gravity = gravity * ALPHA + nextValue * (1 - ALPHA);
        return nextValue - gravity;
    }
}
