package day23_Monday;
import java.util.Arrays;
import java.util.*;

public class SortingAStringArray_Example {

    public static void main(String[] args) {

        String[] names = {"John","Adam","Don"};
// Syntax for sorting Array elements
        Arrays.sort(names);
        for (String item: names) {

            System.out.println("name "+item);

        }

         System.out.println(Arrays.toString(names));
    }
}
