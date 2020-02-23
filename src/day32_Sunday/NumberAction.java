package day32_Sunday;

public class NumberAction {
    public static void main(String[] args) {

        /**
         * Create static void methods as below
         *
         * numberComparision
         * this method has 2 parameters called num1 and num2
         * if num1 is more than num2 print num1 is more than num2
         * if num2 is more than num1 print num2 is more than num1
         * if num2 are equals num1 print they are equal
         *
         * String repeater
         * this method has 2 parameters
         *     String strToRepeat and int count
         *    repeat printing the string as many time as <count> number define
         *
         * skipCountBy3From0to50
         *
         * * create a method that has no parameter
         * and skip count by 3 from 0 to 50
         *
         * countDownByEvenNumberFrom50to0
         * * create a method that has no parameter
         * and count Down By Even Number From 50 to 0
         * for example 50 , 48 , 46 .....0
         *
         * print1toX
         * * create a method that has 1 int parameter called x
         * print from 1 to that number in one line
         * print an empty line after the print.
         *
         *
         */

        numberComparison(5,8);
        numberComparison(9,3);
        numberComparison(5,5);


        repeater("120k", 10);

        skipCountBy3From0to50();

        countDownByEvenNumberFrom50to0();

        print1toX (9);

    }


    public static void numberComparison(int num1, int num2){

        if (num1 > num2) {
            System.out.println("num1 is greater than num2");


        } else if (num1 < num2) {
            System.out.println("num2 is greater than num1");


        } else {
            System.out.println("THEY ARE EQUAL!!!!");
        }
    }


public static void repeater (String strToRepeat, int count){

    for (int i = 0; i <= count; i++) {

        System.out.print(strToRepeat+" ");

    }
    System.out.println();

}


public static void skipCountBy3From0to50(){

    for (int i = 0; i < 50; i+=3) {

        System.out.print(i + " ");
    }
    System.out.println();
}

    public static void countDownByEvenNumberFrom50to0(){

        for (int i = 50; i >0 ; i-=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void print1toX(int x){

        for (int i = 1; i <=x; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

}
