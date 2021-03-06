package day15;

public class ReversingAString {
    public static void main(String[] args) {

        String name = "Akbar";

        System.out.println(name.charAt(0) + " " + name.charAt(1) + " " +name.charAt(2) + " "
                +name.charAt(3) + " " + name.charAt(4) );

        System.out.println(name.charAt(4) + "" + name.charAt(3) + "" +name.charAt(2) + ""
                +name.charAt(1) + "" + name.charAt(0) );

        // how do you find out the last character of any String
        //counting character start with one
        // counting index (location)start with 0;
        //so last character index/location will be always one less than actual character count

        // So , Akbar has 5 character
        //01234 and last character index is 4 NOT 5 ----> 5 - 1 = 4;

        int characterCount = name.length();
        int lastCharIndex = characterCount - 1;
        char lastChar = name.charAt(lastCharIndex);


        System.out.println("Last Character is  " +lastChar);


        System.out.println("last character in one shot: " + name.charAt(name.length() - 1));

    }
}
