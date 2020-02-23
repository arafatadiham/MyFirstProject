package day62_Wednesday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));

        // any type of collection has size method to count the item
        System.out.println("How many ??  states.size() = " + states.size());

        for (String each : states) {
            System.out.println("each = " + each);
        }

        // FOR LOOP DOES NOT WORK!!!! NO INDEX!!!!!!!!!
        // We can use iterator for any type of collection at all time

//        // Way 1: creating iterator
        Iterator<String> stIter = states.iterator();

        while( stIter.hasNext()  ){
            System.out.println("stIter.next() = " + stIter.next());
        }

        // Way 2: this is another way to do it:
        states.forEach(each -> System.out.println("each state = " + each));




    }

}