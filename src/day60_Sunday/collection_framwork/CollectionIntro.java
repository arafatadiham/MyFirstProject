package day60_Sunday.collection_framwork;

import java.util.*;

// an interface extend another interface

public class CollectionIntro {

    public static void main(String[] args) {


        //  List<String> names = new ArrayList<>();


        //List interface extends Collection interface
        //and ArrayList implements List interface
        // so we can say that ArrayList IS-A Collection


        List<String> names = new ArrayList<>();

        // Important : List is a only type of collection that has Index

        //if you put like this (below), you won't get .get() method:
        // Collection <String> names = new ArrayList<>();



        names.add("Hasan");
        names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");
        names.add("Lorin");
        names.addAll(names); // addAll method parameter type is Collection (interface) so we can pass anything IS-A Collection

//        names.remove("Hasan");
        // removeAll can be used to remove many items at the same time
        // removeAll expect another Collection object

        names.removeAll(Arrays.asList("Hasan"));

        // quickly generating a type of List object and assign it to super type Collection :
        Collection<String> toRemoveLst = Arrays.asList("Abdullo");
        names.removeAll(toRemoveLst);

//        System.out.println("names = " + names);
//
//        for(String eachName : names  ){
//            System.out.println("eachName = " + eachName);
//        }

//        System.out.println("first item " + names.get(0) );
        // OPTIONALLY : THIS IS HOW WE CAN USE forEach method to print out everything in one shot
        names.forEach(each -> System.out.println("each = " + each));



        names.get(0);


    }
}
/*
 * The word Collection everywhere :
 *
 *
 * Collection Framework -->> referring entire things , entire topic
 *
 * Collection Interface --->> one interface under the entire Collection Framework
 *
 * Collections class  -->> (it has s at the end, just like Array and Arrays )
 *                   -->>  is a utility class with many static methods
 *                 for example : Collections.sort(your collection object1)
 *
 *
 * */