package day08;

import java.util.Scanner;

public class WarmUpTaskWithScanner {

    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);

        System.out.println("Guess my favorite number?");

        int myFavoriteNumber= input.nextInt();

        if (myFavoriteNumber == 8) {
            System.out.println("Good guess!");
        } else {
            System.out.println ("Bad guess");
        }

    }
}
