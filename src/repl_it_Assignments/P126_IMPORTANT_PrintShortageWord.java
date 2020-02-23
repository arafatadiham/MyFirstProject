package repl_it_Assignments;

import java.util.Arrays;
import java.util.Scanner;

// olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

public class P126_IMPORTANT_PrintShortageWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] allWords = str.split(",");
        System.out.println( Arrays.toString(allWords));

        String shortestWord = allWords[0];


        for (String currentWord : allWords) {

            if (currentWord.length() < shortestWord.length()) {
                shortestWord = currentWord;

            }

        }
        System.out.println(shortestWord);
    }

}
