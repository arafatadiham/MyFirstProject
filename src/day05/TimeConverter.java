package day05;

import java.util.Scanner;


    //Task 3 :
            //*  Create an interactive program to ask user for day count
    // and generate minute that day have
  //

    /*
    Task 4 :
    *  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
        assume that he works 2080 hour for a year.
    * */

    /*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>

        Your grand total for this shopping is ????

    * */


public class TimeConverter {


    public static void main(String[] args) {

   // Task 3:
        Scanner time = new Scanner(System.in);
        System.out.println("how many days do you work per week?");
        double day = time.nextDouble();
        double minutes = day * 60 * 8;
        System.out.println("You are working " + day + " days per week, which means you work " +
                minutes + " minutes per week.");
// Task 4:
        Scanner wage = new Scanner(System.in);
        System.out.println("What is your hourly wage?");
        int wageInHour= wage.nextInt();
        int salary= wageInHour * 2080;
        System.out.println("Your hourly wage is $"+wageInHour + " , so your yearly salary will be $ " +salary);

// Task 5:
        Scanner grocery= new Scanner(System.in);

        System.out.println("What is the price of tomato?");
        double tomatoPrice = grocery.nextDouble();
        System.out.println(" How many tomato you want to buy?");
        int tomatoCount = grocery.nextInt();
        double tomatoTotal= tomatoPrice * tomatoCount;

        System.out.println("What is the price of potato?");
        float potatoPrice= grocery.nextFloat();
        System.out.println(" How many potato you want to buy?");
        int potatoCount= grocery.nextInt();
        float potatoTotal= potatoPrice * potatoCount;

        System.out.println("What is the price of banana?");
        float bananaPrice= grocery.nextFloat();
        System.out.println(" How many banana you want to buy?");
        int bananaCount= grocery.nextInt();
        float bananaTotal= bananaPrice * bananaCount;

        System.out.print("Your grand total for this shopping is $" + (tomatoTotal + potatoTotal + bananaTotal) + ". Thank you and have a nice day!");


    }
}