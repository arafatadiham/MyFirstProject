package day63_Saturday;

import java.util.*;

public class PracticeRemoveDuplicate {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

//1. step:
      String [] eachChar = str.split("");
        System.out.println("Arrays.toString(eachChar) = " + Arrays.toString(eachChar));
//2 . step:
        List<String> charList = Arrays.asList(eachChar);

        //3. Step 3:
        Set<String> newHash = new HashSet<>(charList);

        System.out.println(newHash);

// with one shot:

        Set<String> newHashSetWithShortWay= new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("newHashSetWithShortWay = " + newHashSetWithShortWay);
    }

}
