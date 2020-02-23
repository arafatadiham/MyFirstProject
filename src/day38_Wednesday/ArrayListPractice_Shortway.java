package day38_Wednesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_Shortway {
    public static void main(String[] args) {

        // create List of 6 double in short way,
        // we will just read them and will not add or remove item

        List<Double> prices = Arrays.asList (9.99, 5.55, 3.28, 8.99, 0.99, 65.67);
        // ----> this is Unmodefiable

               //  prices.add (12.8); ---->
               // prices.remove(0);
      //  System.out.println("After add 12.8 to List <Double> : = " + prices);

        int count =0;

        for (Double each : prices){
            if (each >5){
                ++count;
            }
        }
        System.out.println(count);

        // I want to add 2 more prices ( does not have to be same list)

        ArrayList<Double> newPrices= new ArrayList <>(prices);
        newPrices.add (199.99);
        newPrices.remove(0.99); // remove method will remove first occurrence of the value
        System.out.println("newPrices = " + newPrices);

        // Creat a ArrayList object in one shot with many items so we ca add or remove

        ArrayList<Double> oneShotPrice = new ArrayList<>(Arrays.asList(9.99,5.55,3.76,8.99));

        System.out.println("oneShotPrice before = " + oneShotPrice);
        // Add 100.99 after 9.99
        oneShotPrice.add(1, 100.99);
        System.out.println("oneShotPrice after adding 100.99  = " + oneShotPrice);
        // remove item 3
        oneShotPrice.remove(2);
        System.out.println("oneShotPrice after removing 3rd item = " + oneShotPrice);


    }
}
