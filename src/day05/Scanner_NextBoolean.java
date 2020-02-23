package day05;

import java.util.Scanner;

public class Scanner_NextBoolean {
    public static void main(String[] args) {
// Creating Scanner object
        Scanner input = new Scanner(System.in);
       // asking user Are you recording?
        System.out.println("Are you recording?" );
        boolean isRecording= input.nextBoolean();
        System.out.println("We are recording " + isRecording);




    }
}
