package day35_Sunday;

public class AsatTask {
    public static void main(String[] args) {

        String sentence = "Asat 345 Arafat 890";

        String[] sentenceSplit = sentence.split(" ");
        String asatNumberString = sentenceSplit[1];
        int asatNumber = Integer.parseInt(asatNumberString);
        System.out.println(asatNumber);

        String arafatNumberString = sentenceSplit[3];
        int arafatNumber = Integer.parseInt(arafatNumberString);
        System.out.println(arafatNumber);


    }
}
