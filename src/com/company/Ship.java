package com.company;

public class Ship extends  Transport implements Printable{

    private String mover;

    public Ship(String type, int speed,String mover) {
        super(type, speed);
        this.mover = mover;
    }

    public String getMover() {
        return mover;
    }

    @Override
    public void print() {
        System.out.println("Тип: "+getType()+",  скорость: "+getSpeed()+",  движитель: "+mover);
    }
}
