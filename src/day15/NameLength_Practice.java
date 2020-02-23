package day15;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class NameLength_Practice {

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);


        System.out.println("What is your name ?");

        String name = scan.next();

        int lengthOfTheName = name.length();
        System.out.println("LENGTH OF THE NAME = " + lengthOfTheName);

        if ( lengthOfTheName<4){
            System.out.println("Short Name");
        } else if (lengthOfTheName >=4 || lengthOfTheName<=11){
            System.out.println("Medium Name");
        } else {
            System.out.println("Long Name");
        }

        //********************

        System.out.println("******Task 2 :******");


        String name1= "Alden";

        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(1));
        System.out.println(name1.charAt(2));
        System.out.println(name1.charAt(3));
        System.out.println(name1.charAt(04));

        if (name1.contains("a") || name1.contains("e")) {
            System.out.println("Name contains a or e");
        } else {
            System.out.println("Your name does not contain a or e");
        }





    }

}
