package day49_Monday.AutonomousInterface;

public class TeslaShop {

    public static void main(String[] args) {

        Tesla t1 = new Tesla (2020,460, "Cyber-Truck");
        t1.selfDrive();
        t1.start();
        t1.goForward();
        t1.charge();
        System.out.println(t1.horsePower);
        System.out.println(t1.toString());


    }

}
