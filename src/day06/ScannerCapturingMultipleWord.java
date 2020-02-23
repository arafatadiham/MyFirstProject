package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {

   /*     /// thi dtask for One word:

        Scanner blabla =new Scanner(System.in);
        System.out.println("what is your name?");
        String name = blabla.next();
        String anotherWord = blabla.next();
        System.out.println("You have entered " + name);
        System.out.println("Another word is  " + anotherWord);


       /// Following Task is for multiple world together:

        System.out.println("What is your name ? ");
        // nextLine method of Scanner is used to capture whole line

        String newName = blabla.nextLine();

    */ //   System.out.println( "You have entered " + newName);

// Task 4
        // use nextLine to ask your bio
        // whats your name
        // which city you live in , including state , Tyson, VA
        // What is your street address


        Scanner blabla =new Scanner(System.in);

        System.out.println("what is your name my friend?");
        String yourName = blabla.nextLine();

        System.out.println("Which city do you live in  include the state?");
        String city = blabla.nextLine();

        System.out.println("Your street number?");
        String street = blabla.nextLine();

        System.out.println(yourName + " lives in " + city + " at " +street);


    }



}
