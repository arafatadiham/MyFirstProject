package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {
/*
        String myOrder = "Pasta";
        String yourOrder = myOrder;

System.out.println("my order is "+ myOrder);
        System.out.println("your order is "+ yourOrder);


   */     // U sing Scanner do same above task:

        Scanner input= new Scanner (System.in);

        System.out.println("what is your oredr ? I want the same ?");

        String yourOrder= input.nextLine();
        String myOrder= yourOrder;

        System.out.println("my order is "+ myOrder);
        System.out.println("your order is "+ yourOrder);


    }
}
