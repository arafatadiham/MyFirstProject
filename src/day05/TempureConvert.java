package day05;

import java.util.Scanner;

public class TempureConvert {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        System.out.println("What is the temputure in F?");
        double fahrenheit= scan.nextDouble();
        double celsius = (5.0/9)*(fahrenheit-32);
        System.out.println("fahrenheit "+ fahrenheit+" is "+ celsius + "is celsius");
    }
}
