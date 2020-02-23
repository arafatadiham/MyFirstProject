package day19_Tuesday;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        //Home work
        // create an interactive program to ask user
        //String Character and ending character
        //then print everything in between
        //it could be string character is after ending character
        //for example user can enter Z A , OR A K
        //can we ask user character? NO!!!
        // Ask user for String and pick first character by charAt()


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 st word with single character to start with");
        String first = scanner.next();
        char firstAsChar = first.charAt(0);

        System.out.println("Enter 2 nd word with single character to end with");
        String second = scanner.next();
        char secondAsChar = second.charAt(0);

        //   user enter  A for first part
        //   user enter C for second part
        // expected result should be A B C

        for (char iChar = firstAsChar; iChar <= secondAsChar; iChar++) {

            System.out.print(iChar + " ");

        }


        // OPTIONAL!!!!!

        // WHAT IF WE DONT WANT TO INCLUDE USERS STARTING AND ENDING POINT// ?
//        for(char iChar = (char)(firstAsChar+1) ; iChar < secondAsChar ; iChar++){
//
//            System.out.print( iChar + " ");
//
//        }


        //   user enter  D for first part
        //   user enter  A  for second part
        // expected result should be D C B A



    }
}
