package day49_Monday.AutonomousInterface;

public class Tesla extends Vehicle implements Autonomous, Chargeable{

    // this is called concrete class
    // concrete class must provide body for all inherited abstract methods
    // or it will not even compile

    int horsePower;
    String model;

    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    // 1. we inherit from Chargeable interface

        //    public  void charge(){
        //        System.out.println("DEFAULT charge, " +
        //                "You may wanna do on your own");
        //    }

    // 2. we inherit from Vehicle abstract class

        //    public void goForward(){
        //        System.out.println("Vehicle going forward");
        //    }



    @Override
    public void start() {
        System.out.println("TESLA model " + model + " start with electricity");
    }



    @Override
    public void selfDrive() {
        System.out.println("TESLA model " + model + " self-Driving");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

