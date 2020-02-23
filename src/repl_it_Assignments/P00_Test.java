package repl_it_Assignments;

import java.util.Scanner;

public class P00_Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int length= word.length();
        int lastIndex= length-1;

        System.out.println(word.charAt(0) +""+ word.charAt(lastIndex));

        System.out.println(word.indexOf("l"));
    }

}
