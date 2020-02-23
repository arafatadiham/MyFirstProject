package repl_it_Assignments;

import java.util.Scanner;

public class P097_CountJava {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int length = word.length();
        int lastIndexCharacter = length - 1;

        //0123456789012345----->Indexlocation
   //     javacavajavacava
//        1234567890123456----> Length of word
        int countOfJava = 0;
        for (int x = 0; x < length - 4; x++) {
            String Java = word.substring(x, x + 5);
            if (Java.equals("acava")) {
                countOfJava++;
            }
        }
        System.out.println("total count : " + countOfJava);
    }
}