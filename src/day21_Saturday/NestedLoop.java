package day21_Saturday;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteration : " + i);
            for (int x = 1; x <= 5; x++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("******TASK 2*****");
        System.out.println("");

        // print odd number from 1 to 10, 4 times;

        for (int y = 1; y <= 4; y++) {

            System.out.println("iteration: " + y);


            for (int r = 1; r <= 10; r++) {

                if (r % 2 == 1) {
                    System.out.print(r + " ");
                }
            }
            System.out.println();
        }
    }
}







