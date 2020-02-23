package day11;

import jdk.swing.interop.SwingInterOpUtils;

public class StringEquality {

    public static void main(String[] args) {

        String name= "Alden";
        String name2= new String ("Alden");
        String name3= "Alden";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println(" USING ==, RESULT:");

        System.out.println(name == name2);
        System.out.println(name == name3);

        //The correct way to comparing String to get consistent result is
        // using one of the String object behaviour / method called
        //equal method
        //str1.equals(str2)

        System.out.println("USING EQUAL METHOD!");
        System.out.println( name.equals(name2));
        System.out.println( name.equals(name3));

        //BOTTOM LINE IS: DO NOT EVER USE == TO CHECK STRING EQUALITY!

    }

}
