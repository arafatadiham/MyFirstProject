package day18_Monday;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("What is the Password");

        String password= scan.next();

        while (! password.equals("B15")) {

            System.out.println("Wrong PW, try Again!");
            password= scan.next();

        }
        System.out.println("Lock opened!");
    }

}


