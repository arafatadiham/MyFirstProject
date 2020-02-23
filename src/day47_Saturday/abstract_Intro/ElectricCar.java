package day47_Saturday.abstract_Intro;

public class ElectricCar extends Car {

    int batteryLevel;

    public static void main(String[] args) {

      //  Car c1 = new Car();
        ElectricCar e1 = new ElectricCar();
        e1.start();


    }

    @Override
    public void start() {
        System.out.println("This is how electric car start ");
    }


    @Override
    public void goForward() {
        System.out.println("Going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Turning " + direction);
    }
}