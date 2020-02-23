package day17_Sunday;

public class SkipCounting {

    public static void main(String[] args) {
        // Skip number by 3 from 0 to 30;
        // 3 6 9 12....27 30;

        int counter=0;

        while (counter<30) {

            counter += 3 ;

            System.out.print( counter + " ");
        }

        System.out.println();

        System.out.println("***************Task 2***********");

        //Wire a program to print out even number from 0 to 50;

        int evenNum= 0;

        while (evenNum<=50) {


            System.out.print( evenNum + " ");
            evenNum +=2;

        }

        System.out.println();

        System.out.println("***************Task 3***********");

        //Wire a program to print out odd number from 0 to 50;

        int oddNum= 1;

        while (oddNum<=50) {

            System.out.print(oddNum + " ");
            oddNum +=2;

        }



    }
}
