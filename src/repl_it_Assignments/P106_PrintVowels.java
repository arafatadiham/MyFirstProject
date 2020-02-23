package repl_it_Assignments;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class P106_PrintVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int length = input.length();


        for (int x = 0; x <= length - 1; x++) {
            char c = input.charAt(x);

            if (c == 'a' || c == 'o' || c == 'u' || c == 'i' ||
                    c == 'e') {
                System.out.print(c + "");
            }

        }

    }
}