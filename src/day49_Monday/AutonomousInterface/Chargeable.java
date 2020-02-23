package day49_Monday.AutonomousInterface;

public interface Chargeable {

    public default void charge(){
        System.out.println("default charge , " + " you may wanna do on your own");
    }
}
