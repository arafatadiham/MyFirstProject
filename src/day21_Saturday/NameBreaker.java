package day21_Saturday;

public class NameBreaker {
    public static void main(String[] args) {

        String myName = "Alden";

        int length = myName.length();


        for (int i = 0; i <= length; i++) {
            String letter = myName.substring(i, i + 1);

            if (letter.equalsIgnoreCase("d")) {
                System.out.println("Found it!!!");
                break;
            }
            System.out.println(letter);
        }
    }

}
