package day47_Saturday.abstract_Intro;

// this is called concrete class
// concrete class must provide body for all inherited abstract methods
// or it will not even compile


public class GasCar extends Car{

    int gasLevel;

    // implementing an abstract method in sub class means
    // providing body for the method in sub class

    @Override
    public void start() {
        System.out.println("This is how GAS car start ");
    }

    @Override
    public void goForward() {
        System.out.println("Gas car Going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Gas car Going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Gas Car Turning " + direction);
    }
}
