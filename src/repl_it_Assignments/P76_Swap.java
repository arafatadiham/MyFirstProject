package repl_it_Assignments;

import java.util.Scanner;

public class P76_Swap {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = "";
        String lastName = "";
        String restPart = "";

        if (email.contains("_")) {
            firstName = email.substring(0, email.indexOf("_"));
            lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            restPart = email.substring(email.indexOf("@"));
            String newFirstName = lastName;
            String newLastName = firstName;
            System.out.println(newFirstName + "_" + newLastName + restPart);
        } else {


            System.out.println(email);


        }
    }
}