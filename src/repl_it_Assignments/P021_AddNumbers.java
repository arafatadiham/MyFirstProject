package repl_it_Assignments;


import java.util.Scanner;

public class P021_AddNumbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");

        int num1= scan.nextInt();
        System.out.println(num1);

        int num2= scan.nextInt();
        System.out.println(num2);

        int num3= scan.nextInt();
        System.out.println(num3);


        int sum=num1+num2+num3;


        System.out.println("Sum of numbers: "+sum);

    }

}
