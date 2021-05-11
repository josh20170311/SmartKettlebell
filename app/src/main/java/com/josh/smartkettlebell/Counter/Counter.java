package com.josh.smartkettlebell.Counter;

public class Counter {
    float prevData = Float.NaN;
    float THRESH_HOLD;
    Setting.Target target;
    public Counter(Setting setting){
        THRESH_HOLD = setting.THRESH_HOLD;
        target = setting.target;
    }
    public boolean count(float currentData){
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
    }
    public static class Setting {

        public Setting(float threshHold, Target target){
            THRESH_HOLD = threshHold;
            this.target = target;
        }
        public enum Target {
            PEAK,
            VALLEY
        }
        float THRESH_HOLD ;
        Target target;
    }
}
