package day05;

import java.util.Scanner;

public class TheScannerPractice {
    public static void main(String[] args) {

 //       Scanner scan = new Scanner(System.in);
   //
        //    System.out.println("your name?");
    //    String name="Jack";
  //   System.out.println("My name is "+ name );

  Scanner scan = new Scanner(System.in);

        System.out.println("What is your name : ");
        //String name = "Sam" ;
        String name = scan.next();
        System.out.println("My name is  " + name );

        System.out.println("What is your birth year");
        int birthYear = scan.nextInt();
        int age= 2019 - birthYear;
        System.out.println("Your age is :" + age);

        System.out.println("What is your height?");
        double height= scan.nextDouble();
        System.out.println("Your height is "+height);

    }
}
