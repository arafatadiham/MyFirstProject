package day26_Saturday;

import java.util.Arrays;

public class CountItemInArray_Interview {
    public static void main(String[] args) {


        String[] marvelHeros = {"Iron Man", "Capitan America", "Spiderman",
                "Balck Panther", "Hulk", "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America", "Spiderman",
                "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeros));

        int sizeOfArray = marvelHeros.length;
        System.out.println("Hero Count = " + sizeOfArray);

        String itemToSearch = "Black Widow";
        int countOfItem = 0;

        for (String eachHero : marvelHeros) {

            if (eachHero.equals(itemToSearch)) {
                countOfItem++;
            }

        }

        // COUNT THE HERO WITH WITH THE NAME CONTAINS BLACK

        System.out.println("countOfItem = " + countOfItem);


        System.out.println("******Find item that CONTAIN  Black"); //Finding unit item in INTERVIEW!

        int cntOfBlackInName = 0;

        for (String eachHero : marvelHeros) {

            if (eachHero.toLowerCase().contains("black")) {
                cntOfBlackInName++;
            }

        }
        System.out.println("cntOfBlackInName = " + cntOfBlackInName);


        // COUNT THE HERO WITH WITH THE NAME CONTAINS BLACK

        System.out.println("countOfItem = " + countOfItem);


    }
}


