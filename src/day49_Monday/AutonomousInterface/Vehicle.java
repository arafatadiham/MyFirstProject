package day49_Monday.AutonomousInterface;

public abstract class Vehicle {
    int year;

//    public Vehicle(){
//
//    }

    public Vehicle (int year) {
        this.year = year;
    }

   public abstract void start ();

    public void goForward() {

        System.out.println("Vehicle goes forward");
    }
}
