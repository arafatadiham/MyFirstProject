package day12;

import jdk.swing.interop.SwingInterOpUtils;

public class LoginTest_V2 {

    public static void main(String[] args) {

 String userName= "abc123";

 boolean userNameCorrect = userName.equals("ABC123");

        System.out.println(userNameCorrect);

 boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");

        System.out.println( nameCheckIgnoreCase);

        //******************************************
        // TASK 2 , PRACTICE ON YOUR NAME:

        // store your name is a name variable
        // check for equality using different uppercase lowercase example
        // using equals and equalsIgnoreCase
        String name = "Emre";
        // I want to store the result of checking name into a variable
        boolean nameEqualsWithoutCase = name.equalsIgnoreCase("emre");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameEqualsWithoutCase);
        // here directly printing without saving into variable
        //                    This will eventually become true or false
        System.out.println(  name.equalsIgnoreCase("eMrE")        );



    }
}
