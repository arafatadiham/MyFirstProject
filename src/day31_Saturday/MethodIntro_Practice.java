package day31_Saturday;

public class MethodIntro_Practice {

    //Create a method called print 7 line of hello and call it sayHelloWorld7Times

    public static void sayHelloWorld7Times () {

// 3 print line statement
        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
// 2 print statement
        System.out.print("Hello world line 4 ");
        System.out.print("Hello world line 5 ");
// 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");
    }

     /*
    *
            * int num1 = 5;
            double num2 = 3.0d;
            float num3 = 3.0f;
            double result1 = num1 + num2;
            double result2 = num1 - num2;
            double result3 = num1 * num2;
            double result4 = num1 / num2;
            float result5 = num1 / num3;
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
            System.out.println(result5);
            Create a method to take above action , call it calculateMathProblem()
    * */

    public static void calculateMathProblem() {

        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }

    public static void main(String[] args) {

        sayHelloWorld7Times();

        // The Second wat to do this:
            //alternatively call using class name
        MethodIntro_Practice.sayHelloWorld7Times();
        //upi can call static method of other class
        //using classname.methodname(..)
        MethodIntro.sayHello();
        calculateMathProblem();
    }
}
