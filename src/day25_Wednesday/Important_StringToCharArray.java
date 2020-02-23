package day25_Wednesday;

import java.util.Arrays;

public class Important_StringToCharArray {
    public static void main(String[] args) {

        // pick up your own name and turn in into char array
        // and use for each loop to loop over them
        // optionally count how many a you have in your name

        String name = "Alden";
// turn this into charArray using toCharArray method of String
        //Here are the 3 questions needs to ask :
        //1. What does it ?
        //2. Do I need to provide extra data while calling the method?
        //3. What do i get out of it?

        char[] nameChars = new char[5];

        char[] allCharsInName = name.toCharArray();

        for (char eachChar : allCharsInName) {
            System.out.println("eachChar = " + eachChar);
        }
        // now count how many "a" we have
        int count = 0;
        for (char eachChar : allCharsInName) {
            if (eachChar == 'd') {
                ++count;
            }
        }
        System.out.println("Count = " + count);

// What if you want to sort all characters of your name
        // in alphabetical order?

        Arrays.sort(allCharsInName);
        System.out.println("After sorting allCharsInName :" + Arrays.toString(allCharsInName));

    }
}
