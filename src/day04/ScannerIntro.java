package day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        //I want to save users input after asking some questions
        //and I want to save this input so I can do something with it

        //Step 1: Use Scanner class to create scanner object
        //that have this functionally

      Scanner scan=new Scanner(System.in);

      //ask user to enter name
        System.out.println("Enter your first name please :");
        // capture what user typed on typed on keyboard in console for name

        String firstName=scan.next();

        System.out.println("You have entered:"+firstName);


    }
}
