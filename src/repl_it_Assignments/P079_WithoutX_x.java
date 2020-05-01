package repl_it_Assignments;

import java.util.Scanner;

public class P079_WithoutX_x {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        boolean firstX = (word.substring(0,1).equalsIgnoreCase("X"));
        boolean lastX = word.substring(word.length() - 1).equalsIgnoreCase("X");

        if ((firstX) && (lastX)) {
            System.out.println(word.substring(1, word.length() - 1));
        }else if (firstX) {
            System.out.println(word.substring(1));
        }else if (lastX) {
            System.out.println(word.substring(0, word.length() - 1));
        }else {
            System.out.println(word);
        }

        }

    }

