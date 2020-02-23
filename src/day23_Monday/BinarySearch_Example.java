package day23_Monday;
import java.util.*;
import java.util.Arrays;

public class BinarySearch_Example {
    public static void main(String[] args) {



             int[] ints = {2, 5, 7, 14};
          //Index Number   0, 1, 2, 3  ----> the last index number is 3,
        // which means if our search value not exist in the Array elements,
        // it gives us negative index location staring from 4,
        //next non exist search value will give us -5 index location, and so on....

        System.out.println("When search 2 , index location is "+Arrays.binarySearch(ints,2));
        System.out.println("When search 5 , index location is "+ Arrays.binarySearch(ints,5));
        System.out.println("When search 7 , index location is "+ Arrays.binarySearch(ints,7));
        System.out.println("When search 8 , index location is "+ Arrays.binarySearch(ints,8));
        System.out.println("When search 9 , index location is "+ Arrays.binarySearch(ints,9));
        System.out.println("When search 14 , index location is "+ Arrays.binarySearch(ints,14));
        System.out.println("When search 17 , index location is "+ Arrays.binarySearch(ints,17));
        System.out.println("When search 26 , index location is "+ Arrays.binarySearch(ints,26));
        System.out.println("When search 14 , index location is "+ Arrays.binarySearch(ints,14));
        System.out.println("When search 100 , index location is "+ Arrays.binarySearch(ints,100));

        // in this case, seems like maximum negative index location only can reach -5 ,
        // Why can't we get negative 6 ? in which situation we can get -6,-7,...

    }
}