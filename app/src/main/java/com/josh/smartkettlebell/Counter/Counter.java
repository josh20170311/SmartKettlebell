package com.josh.smartkettlebell.Counter;

public class Counter {
    float prevData = Float.NaN;
    float THRESH_HOLD;
    Setting.Target target;
    int type;
    public Counter(){
        target = Setting.Target.PEAK;
        THRESH_HOLD = -1;
        type = Setting.TYPE_ACC_X;
    }
    public Counter(Setting setting){
        THRESH_HOLD = setting.THRESH_HOLD;
        target = setting.target;
        type = setting.type;
    }
    public boolean count(float[] data){
        float currentData = data[type];
        if((prevData <= THRESH_HOLD && currentData > THRESH_HOLD && target == Setting.Target.PEAK) ||
                prevData >= THRESH_HOLD && currentData < THRESH_HOLD && target == Setting.Target.VALLEY){
            prevData = currentData;
            return true;
        }

        prevData = currentData;
        return false;
    }
    public void reset(Setting setting){
        THRESH_HOLD = setting.THRESH_HOLD;
        target = setting.target;
        type = setting.type;
        prevData = Float.NaN;
    }
    public static class Setting {
        public static final int TYPE_ACC_X = 0;
        public static final int TYPE_ACC_Y = 1;
        public static final int TYPE_ACC_Z = 2;
        public static final int TYPE_GYR_X = 3;
        public static final int TYPE_GYR_Y = 4;
        public static final int TYPE_GYR_Z = 5;
        public static final int TYPE_MAG_X = 6;
        public static final int TYPE_MAG_Y = 7;
        public static final int TYPE_MAG_Z = 8;
        float THRESH_HOLD ;
        Target target;
        int type;
        public enum Target {
            PEAK,
            VALLEY
        }
        public Setting(float threshHold, Target target,int type){
            THRESH_HOLD = threshHold;
            this.target = target;
            this.type = type;
        }
    }
}
