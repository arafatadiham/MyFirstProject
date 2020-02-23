package day47_Saturday.abstract_Intro;

import day45_Tuesday.Electronic;

public class Garage {

    public static void main(String[] args) {

        // Abstract class can not be instantiated
        // It means we can not create object out of it
//        Car c1 = new Car();

      ElectricCar e1 = new ElectricCar();
        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("left");

        // Create another sub class of Car called GasCar
        // add a instance field called gasLevel as int
        // implements all the abstract method of Car class

        // Create GasCar object here
        // call all the methods to test


        GasCar g1 = new GasCar();
        g1.start();
        g1.goForward();
        g1.goBackward();
        g1.turn("right");
        System.out.println(g1.gasLevel);


    }

}


