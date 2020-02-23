package day18_Monday;

import java.util.Scanner;

public class SmartLockOpener_3Attemp {

    public static void main(String[] args) {

        // please try if user has only 3 attempt for entering PW:

        // entering password for the first time

        Scanner scan= new Scanner(System.in);

        String password = scan.next();
        int attemptCount = 1;

        while (!password.equals("B15")) {

            System.out.println("You attempt count is : " + attemptCount);
            if (attemptCount == 3) {
                System.out.println("LOCKED OUT !!!!!!!");
                return; // this is used to exit from the method here!!!
            }

            System.out.println("WRONG PASSWORD!! TRY AGAIN!!");
            password = scan.next();
            ++attemptCount;

        }

        System.out.println("OPEN SESEAME !!!");



    }

}
