package day20_Wednesday;

public class Get2SiblingChar {

    public static void main(String[] args) {

        String name = "Ayra";

        int lastCharIndex = name.length() - 1;



        for (int x = 0; x <= lastCharIndex -1 ; x ++) {

            System.out.println(name.substring(x, x + 2));

        }

//beggining
        // if you want to print 3 character, for example:
        // Ayr
        // yra

        System.out.println("Getting 3 Character");

        for (int x = 0; x <= lastCharIndex -2 ; x ++) {

            System.out.println(name.substring(x, x + 3));
        }
        }
}
