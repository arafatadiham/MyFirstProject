package day21_Saturday;

public class CountSomethingInString {
    public static void main(String[] args) {

        // Find out index of all the word an in cases insensitive manner
        // I will go through each and every letter of the String  by 3 chars  '
        //                  --->> each 3 character i can use substring(0,2) and so on
        //                  --->> going to 0 to two character before last char index  --->>> for loop

        // while i am going through each and every 2 character
        // i will check whether current string i am looking at
        //  equals to <an> in case insensitive     --->>>  currentCharacter.equalsIngnoreCase("an")
        // if it is  I will Add 1 to my count     index )
        //  if not  -->> just move on
        // perform this action until I reach one character before last character
        //  because last chance to get 3 characters is -->> 2 characters before last character


        String myName = "Amelia Israfil Hajitev mehmet Hajitev Amelia Behlia Ashr";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);


        int counter =0;

        System.out.println("---3 chars ---");
        //for (int x = 0; x < charCount-3 ; x++) {
        for (int x = 0; x <= lastCharIndex - 2; x++) {

            // saving the current 3 characters
            String current3Chars = myName.substring(x, x + 3);

            if (current3Chars.equalsIgnoreCase("lia")) {

                System.out.println("The index of lia is " + x);
               // counter = counter +1;
               // counter +=1;
                counter ++;

            }

        }

        System.out.println(counter);

    }
}
