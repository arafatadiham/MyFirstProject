package repl_it_Assignments;

import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {

        // create a class called EmailBuilder with main method

// create 3 String variable for first name  last name , company
// create another variable for email
// create email in this format firstName_lastName@company.com

// print out the result as , my name is <your full name> and I work for <company> and my email is <email>

      /*  String name = "Alden";
                String lastName = "Adiham";
                        String company = "OG";
                       String email= name+"_"+lastName+"@"+company+".com";

                        System.out.println( "My name is " +name+ " "+ lastName+ "and I work for "+ company+"and my email is "+ email);



                        // This is Akbar 's code whe we use Scanner:
*/
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your first name , last name , company seperated by space : ");

        String firstName, lastName, company, email;
        firstName = scan.next();   //"Astrit";
        lastName = scan.next();   //"Enver";
        company = scan.next();   //"Verizon";
        // firstName_lastName@company.com    Astrit_Enver@Verizon.com
        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.println(" My name is " + firstName + " " + lastName + " and I work for " + company + " "
                + "and my email is " + email);

    }
}
