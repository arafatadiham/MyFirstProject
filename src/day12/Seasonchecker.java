package day12;

import java.util.Scanner;

public class Seasonchecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter your Season please :");
        String season = scan.next();

        if (season.equalsIgnoreCase("Spring")) {
            System.out.println("Hiking");
        } else if ( season.equalsIgnoreCase("Summer")) {
            System.out.println("Swimming");
        }else if ( season.equalsIgnoreCase("Fall")) {
            System.out.println("JAVA CODE");
        } else if ( season.equalsIgnoreCase("Winter")) {
            System.out.println("Ski");
        } else {
            System.out.println("Invalid");
        }

    }
}
