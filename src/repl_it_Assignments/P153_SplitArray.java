package repl_it_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class P153_SplitArray {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String s)
    {

        //your code here

        String [] splitInfor= s.split(",");
        System.out.println(Arrays.toString(splitInfor));
        String personName= splitInfor[0];
        String lastName= splitInfor[1];
        String age= splitInfor[2];

        System.out.println("Person name: " + personName +
                " last name: " + lastName +
                " age: " + age);

    }//end person

}