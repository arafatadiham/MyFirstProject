package day60_Sunday.collection_framwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10,4,5,22,88,13));

        // You can't use foreach loop to remove item here, it will give you "concurrentModificationException]

        // iterating over a collection object using iterator
        Iterator<Integer> myIter = nums.iterator();

        while (myIter.hasNext()){
           // System.out.println("myIter.next() = " + myIter.next());

            if (myIter.next() <= 10){
                myIter.remove();
            }

        }
        System.out.println("nums = " + nums);


        //hasNext() ---> check whether you have next item, return boolean
//        System.out.println("myIter.hasNext() = " + myIter.hasNext());
//
//        // next() ---> will move the pointer  of iterator to the next element
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//
//
//      //removing whatever is the iterator is pointing to at this location
//        myIter.remove();
//
//        System.out.println("myIter.next() = " + myIter.next());
//
//        System.out.println("myIter.hasNext() = " + myIter.hasNext());
//
//        System.out.println("nums = " + nums);


    }
}
