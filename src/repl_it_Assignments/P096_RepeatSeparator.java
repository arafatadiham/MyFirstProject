package repl_it_Assignments;

import java.util.Scanner;

public class P096_RepeatSeparator {

    public static void main(String[] args) {

        String word = "Cat";
        String sep = "X";
        int count = 1;

        String result = word;
        for (int i = 1; i < count; i++) {

                result = result + sep + word;

        }
        System.out.println(result);
    }
}
