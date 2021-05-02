package com.josh.smartkettlebell.model;

import java.util.Date;

public class Exercise {
    String name;
    int number;

    public Exercise(String name, int number){
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
