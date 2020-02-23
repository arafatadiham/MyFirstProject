package day15;

public class SubStringPractice {

    public static void main(String[] args) {

        String movie= "Lord Of The Ring";

        // I want to get the word "Of" from the movie;

        String wordOf = movie.substring (5,7);

        //------> 5 means, starting from 5 index
        ///----> 7 means, stop right before get 7

        System.out.println("WordOf = " + wordOf);

        // Get from the second word till last word
        //                0123456789012345
        // String movie= "Lord Of The Ring"

        int startPoint = movie.indexOf(" ") +1;
        int endingPoint= movie.length();

        System.out.println("second word till last : "
                + movie.substring(startPoint,endingPoint));

        System.out.println("****** Option 2 to do :******");

        String secondWordTillLast= movie.substring(5,16);
        System.out.println("Second Word tilllast = " + secondWordTillLast);

        //*************************************

        System.out.println("********** Practice 3:********");
        System.out.println("\n");

        // If you want to start from somewhere and just get the rest of the String
        // above method will work , however there is even better method
        // if you provide only one parameter to substring method
        // it will just start from that location and get till the end

        String secondToLast = movie.substring(5);


        System.out.println("\n");

        System.out.println("********** Practice 4:********");

        //                0123456789012345
        // String movie= "Lord Of The Ring"

        String wordLord= movie.substring (0,4);
        String wordRing= movie.substring (12,16);
        String wordOf1 = movie.substring (5,7);
        String wordThe= movie.substring(8,11);

        System.out.println(wordLord+ " "+wordOf1+" "+wordThe+" "+wordRing);
    }
}
