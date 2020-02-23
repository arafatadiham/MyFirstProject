package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println ("What is your current speed ?");

        int yourCurrentSpeed= input.nextInt();

        System.out.println ("What is the speed limit ?");

        int speedLimit= input.nextInt();



        if (yourCurrentSpeed>= speedLimit) {

            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
        }

        System.out.println ("The end!");

    }
}

