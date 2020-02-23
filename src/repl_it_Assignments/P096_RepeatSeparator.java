package repl_it_Assignments;

import java.util.Scanner;

public class P096_RepeatSeparator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();  //-----> count of word that appear

        String completedWord = "";

        for (int x= 0; x<count; x++) {
            completedWord = word + separator;
            System.out.print(completedWord);

            if (count == 0)
                System.out.println("wrong!");
        }
    }
}
