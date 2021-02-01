package com.company;

public class Terrestrial extends  Transport implements Printable{
    private int num_of_wheels;

    public Terrestrial(String type, int speed,int num_of_wheels) {
        super(type, speed);
        this.num_of_wheels = num_of_wheels;
    }

    public int getNum_of_wheels() {
        return num_of_wheels;
    }

    @Override
    public void print() {
        System.out.println("Тип: "+getType()+",  скорость: "+getSpeed()+",  количество колес: "+num_of_wheels);
    }
}
