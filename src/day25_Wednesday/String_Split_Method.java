package day25_Wednesday;

import java.util.Arrays;
import java.util.Scanner;

public class String_Split_Method {
    public static void main(String[] args) {


        String sentence2 = "jeep is deep";

        String[] cool = sentence2.split("e");

        System.out.println(Arrays.toString(cool));

        System.out.println("********Task 1*******");

       /*
        If email contains no @ character or multiple @ characters then print invalid email:

        email -> hello-gmail.com
        print:
        invalid email

        email -> my@fancy@email.com
        print:
        invalid email
        */

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String emailArray [] = email.split("@");
        if (emailArray.length ==1 || emailArray.length>=3){
            System.out.println("invalid email");
        }else {
            System.out.println("Email id: " +emailArray[0]);
            System.out.println("Email domain:" +emailArray[1] );
        }



    }
}