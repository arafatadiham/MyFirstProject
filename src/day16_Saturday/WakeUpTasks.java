package day16_Saturday;

import java.util.Scanner;

public class WakeUpTasks {
    public static void main(String[] args) {
//        Given a word with 4 characters
//        stored in a String variable word1
//        create a String variable called word2
//        store the reversed word1 into word 2
//        and print out
//        FOR EXAMPLE :
//        word1 ==> Java    -->> word2 avaJ
//                -- optionally ask this word from scanner
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word with 4 characters:");
        String word1 = sc.next();
        String word2 =(word1.charAt(3) +""+word1.charAt(2) +""+word1.charAt(1) +""+word1.charAt(0) +"");
        System.out.println(word2);
    }
}
