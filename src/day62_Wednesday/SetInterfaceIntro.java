package day62_Wednesday;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceIntro {

    public static void main(String[] args) {


        //Set is data structure to store unique elements:
        //HashSet implements Set interface and always default choice

        //IMPORTANT:
        // 1. It does NOT keep insertion order
        // 2. It does NOT have Index

        // HashSet<Integer> myNums = new HashSet<>();
        Set<Integer> myNums = new HashSet<>();

        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);

        System.out.println("myNums = " + myNums);




    }

}
