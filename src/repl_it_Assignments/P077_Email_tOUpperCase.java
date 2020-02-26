package repl_it_Assignments;

import java.util.Scanner;

public class P077_Email_tOUpperCase {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //craig_federighi@apple.com
        String email = scan.next();

        String allUpperCase = email.toUpperCase();

        int underScore = allUpperCase.indexOf("_");

        String newStoredEmail = "";
        for (int i = 0; i < allUpperCase.length(); i++) {
            char eachChar = allUpperCase.charAt(i);
            if (i == 0 || i == underScore + 1) {
                newStoredEmail = newStoredEmail + allUpperCase.charAt(i);
            } else {
                newStoredEmail = newStoredEmail + email.charAt(i);
            }
        }
        System.out.println(newStoredEmail);

    }
}