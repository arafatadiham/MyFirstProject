package repl_it_Assignments;

import java.util.Scanner;

public class P107_SliceNumber {

    public static void main(String[] args) {

        int num, digit1, digit2, digit3, digit4, digit5;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your number:");

        String inputNumber=scan.nextLine();

        int length = inputNumber.length();

        for(int x=0;x<length;x++) {

            System.out.println(inputNumber.substring(x,x+1));

        }

    }
}
