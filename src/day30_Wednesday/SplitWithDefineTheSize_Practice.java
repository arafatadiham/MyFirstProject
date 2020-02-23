package day30_Wednesday;

import java.util.Arrays;

public class SplitWithDefineTheSize_Practice {
    public static void main(String[] args) {

        String sentence =  "I love Java  Java Java";

        // String [] wordsArray= sentence.split(" ");
        String [] wordsArray= sentence.split(" ", 3); //-->limit is how many pieces you want

        System.out.println("wordsArray = " + Arrays.toString(wordsArray));
        System.out.println("wordArray size = " + wordsArray.length);

    }
}
