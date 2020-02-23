package day59_Saturday;

import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        // This simple program will get certain character from furkan's name
        // according to the index user provided

        System.out.println("The Start" );
        String name = "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name ? ");
        int targetIndex = scan.nextInt();

        System.out.println(name.charAt( targetIndex  ));

        System.out.println("name = " + name);
        System.out.println("The End" );


        // Exceptions are object , so it has it's own class
        // and we can create object ourselves just like we did from any other classes
        //StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
        //System.out.println( e1.toString() );


        String str = ""; //"ABC";    //null;
//if we write "ABC" it will directly print out result without exception
//if we write null it will go to NullPointerException block
//if we write "" it will go to Exception block


    }

}
