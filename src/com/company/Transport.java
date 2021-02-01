package com.company;

public class Transport {
    private String type;
    private int speed;

    public Transport(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }
}
