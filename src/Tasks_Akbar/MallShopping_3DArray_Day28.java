package Tasks_Akbar;


import java.util.Arrays;

public class MallShopping_3DArray_Day28 {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        //TASK 1. Check if all 3 arrays are exact same length
        //Print "All arrays are equal length"

        int itemsLength= items.length;
        int pricesLength= prices.length;
        int IDsLength= itemIDs.length;

        if (itemsLength==pricesLength && pricesLength==IDsLength){
            System.out.println("All arrays are equal length");
        }
        System.out.println();
      //

        //TASK 2. Print how many items purchased
        System.out.println("Items count: " + itemsLength);

        //TASK 3. Print a receipt report.
        /*
            12345 - Shoes - $99.99
            ...
            458.8 * 0.06 + 458.8
            Total price: $458.8 (include tax)
         */
        double totalPrice = 0.0;

        for (int i = 0; i < itemsLength; i++) {
            System.out.println(itemIDs[i]+" - "+items[i]+" - "+prices[i]);
            totalPrice += prices[i];
        }
        double totalPrice1= totalPrice*0.06+totalPrice;
        System.out.println("Total price: $"+totalPrice1+" (include tax)");


        //TASK 4. Find/Look for "Airpods" in items and print along with price and itemID


        //TASK 5. Find the most expensive item and print all details
        //{99.99, 150.0, 9.99, 250.0 , 439.50, 39.99}

        double maxPrice = prices[0];
        int maxPriceIndex = 0;

        // YOUR CODE GOES HERE

        // BELOW IS ALREADY WRITTEN FOR YOU
        System.out.println("Most expensive item:");
        System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " - "+prices[maxPriceIndex]);

    }
}
