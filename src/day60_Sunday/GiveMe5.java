package day60_Sunday;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 0; // initialize the number to 0;
        while (num!=5){   // when user does not enter 5 we keep asking
            System.out.println("Give me 5 ?? ");
            try {
                num = scan.nextInt(); // ask user to enter number , might get letter instead
                if(num==5) { // if correct number we get out of the loop
                    System.out.println("BINGO! YOU HAVE ENTERED 5 !!!!");
                    break; // get out of while loop !!!!
                }
            }catch(InputMismatchException e){
                System.out.println("Please Enter Number!");
                // to capture invisible blank line when entering anything not number
                scan.nextLine();
            }
        }
        System.out.println("Excellent !!! we got high five!!!");

    }
}
