package repl_it_Assignments;
import java.util.*;
public class P120_FindingMaxLengthInStringArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }

        String longestWord = "";

        for (int i = 0; i < 5; i++) {
            for (String currentWord : words) {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;

                }

            }

        }
        System.out.println("longestWord = " + longestWord);
    }

}

