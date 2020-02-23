package day16_Saturday;

import java.util.Scanner;

public class Give5 {
    public static void main(String[] args) {

        // I want to ask user enter a number
        // I will keep asking until user actually enter number 5
        Scanner scan = new Scanner(System.in);
        //System.out.println("Give me Five!!!");
/*        int userNumber = scan.nextInt();
        if(userNumber != 5){
            System.out.println("Hey You Did not Give me 5!!!");
        }*/
        int userNumber = 0;
        while (userNumber != 5 ){
            System.out.println("Give me Five!!!");
            userNumber = scan.nextInt();
        }
        System.out.println("End Of The Program");
    }

    }

