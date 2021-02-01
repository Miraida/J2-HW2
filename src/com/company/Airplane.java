package com.company;

public class Airplane extends  Transport implements Printable{

    private int engine_number;

    public Airplane(String type, int speed,int engine_number) {
        super(type, speed);
        this.engine_number = engine_number;
    }

    public int getEngine_number() {
        return engine_number;
    }

    @Override
    public void print() {
        System.out.println("Тип: "+getType()+",  скорость: "+getSpeed()+",  количество двигателя: "+engine_number);
    }
}
