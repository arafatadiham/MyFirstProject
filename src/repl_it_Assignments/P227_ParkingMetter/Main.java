package repl_it_Assignments.P227_ParkingMetter;

public class Main {

    public static void main(String[] args) {

        ParkingMeter p1 = new ParkingMeter(100);

        System.out.println( p1.add(2)); // I test "25, 200, 15" one by one, good result!

        System.out.println( p1.isExpired());// I test timeLeft=0, and it gives true;
                                            // when I test timeLeft =10, result gives false;

    }
}
