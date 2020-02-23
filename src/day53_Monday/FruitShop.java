package day53_Monday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {

    public static void main(String[] args) {
//          Power of polymorphism is:
//        reference type determines access at compile time;
//        object type determines methods at runtime
       // Polymorphism  make sure you object take action

       Apple a1 = new Apple("sweet", "red", "Fuji") ;

       // What can I access using reference variable a1
        // a1 has Apple as reference type, so we can access anything inside apple
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        a1.getDigested();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Fruit f1 = a1 ; //new Apple("sweet", "red", "Fuji") ;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        // But you CAN'T access f1.type coming mfrom apple if we refer it is as Fruit;
        //But you can access getDigested method;

        //if we comment out grtDigested() method from Fruit class (super class)
        //If fruit does NOT have getDigested method
        // below will NOT compile
        //BECAUSE only reference type decide what you can access
        f1.getDigested(); //new Apple("sweet", "red", "Fuji").getDigested()

        f1 = new Orange("sour-sweet","redish", 11);
        f1.getDigested();// if we have Fruit as reference type, getDigested method will point to under the Fruit class;
                            // Actual object is Apple | Orange , at run time it will call overriden version of the method
                            //and that's the power of polymorphism , making the correct decision at runtime according to the actual object

        System.out.println(f1.toString()); // you will get toString from Orange, NOT from Fruit

        //Fruit is reference type, Apple is actual object type below:
       Fruit f2 = new Apple("crispy but tasteless","hot red", "Gala");

       Fruit f3 = new Orange ( "sour","orange",10);

        Fruit f4 = new Orange ( "very sweet", " blood red", 10);

        Fruit [] myFruits = {f1,f2,f3,f4};

        for ( Fruit each : myFruits) {
            // only your reference type decide what you can access, which is Fruit here,
            // so you won't able to access variable named "type" from Apple
            each.getDigested();
        }

        // in below Arrays creation way, we can't not resizable | adding | removing will not work
      //  List<Fruit> fruitList = Arrays.asList(f1,f2,f3,f4);


        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1,f2,f3,f4));

        for (Fruit each : fruitList) {
            System.out.println("each.toString() = " + each.toString());
            //refelaction API
            System.out.println("Class Type : " +  each.getClass().getSimpleName());
        }


    }
}
