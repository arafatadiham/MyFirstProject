package repl_it_Assignments;

import java.util.Scanner;

public class P024_PatientInformation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName= scan.next();
        System.out.println("Enter your last name");
        String lastName= scan.next();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city

        System.out.println("Enter your city");
        String city= scan.next();
        System.out.println("Enter your state");
        String state= scan.next();
        System.out.println("Enter your zip code");
        int zipcode= scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber= scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber= scan.nextLong();
        System.out.println("Enter your age");
        int age= scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your work weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        String contacts= ("work phone number - "+workPhoneNumber+
                ",personal phone number - "+ personalPhoneNumber+",  email: "+email);
        String fullName= firstName+lastName;
        String Address= (street+", " +city+", "+state+" "+zipcode);

    }


}
