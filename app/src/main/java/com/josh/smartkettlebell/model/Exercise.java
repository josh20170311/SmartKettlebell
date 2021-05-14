package com.josh.smartkettlebell.model;

import java.io.Serializable;
import java.util.LinkedList;

public class Exercise implements Serializable {
    String name;
    int number;
    int actualNumber;
    LinkedList<MotionData> motionData;


    public Exercise(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getActualNumber() {
        return actualNumber;
    }

    public void setActualNumber(int actualNumber) {
        this.actualNumber = actualNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LinkedList<MotionData> getMotionData() {
        return motionData;
    }

    public void setMotionData(LinkedList<MotionData> motionData) {
        this.motionData = motionData;
    }
}
