package day16_Saturday;

public class Test_LastWord {
    public static void main(String[] args) {

     //Task :
        // print out the last word of the sentence;

        String sentence = "You do Understand all about this";
        System.out.println("sentence = " + sentence);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        String lastWord = sentence.substring(lastSpaceIndex+1);
        System.out.println("lastWord = " + lastWord);

    }
}
