package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ship ship2 = (Ship) createObject("Ship");
        Airplane airplane = (Airplane) createObject("Airplane");
        Terrestrial terrestrial = (Terrestrial) createObject("Terrestrial");

        ship2.print();
        airplane.print();
        terrestrial.print();

    }
    public static Object createObject(String className){
        String[] str = getInfo(className);
        switch (className){
            case "Ship": Ship ship = new Ship(str[0],Integer.valueOf(str[1]),str[2]);
                return ship;
            case "Airplane" : Airplane airplane = new Airplane(str[0],Integer.valueOf(str[1]),Integer.valueOf(str[2]));
                return airplane;
            case "Terrestrial" :
                Terrestrial terrestrial = new Terrestrial(str[0],Integer.valueOf(str[1]),Integer.valueOf(str[2]));
                return terrestrial;
            default:
                System.out.println("You entered the WRONG class name!");
                return null;
        }
    }
    public static String[] getInfo(String className){
        String[] str =new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of "+className+"  (грузовой,гражданский,военный,...)");
        str[0] = scanner.nextLine();
        System.out.println("Enter speed of "+className);
        str[1] = scanner.next();
        switch (className){
            case "Ship":
                System.out.println("Enter mover: (парус,двигатель)"); str[2] = scanner.next(); break;
            case "Airplane":
                System.out.println("Enter engine number: (1-12)"); str[2] = scanner.next(); break;
            case "Terrestrial":
                System.out.println("Enter wheels number: "); str[2] = scanner.next(); break;
        }
        return str;
    }
}
