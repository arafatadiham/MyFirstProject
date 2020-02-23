package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {

        //      System.out.println(5+3);//8
        //
        //     System.out.println(5-3);//2
        //     System.out.println(5*3);//15
        //     System.out.println(5/3);//1

        // arithmetic operator between two int----> another int

        //     System.out.println(5+3.0d);//8
        //      System.out.println(5-3.0d);//2
        //     System.out.println(5*3.0d);//15
        //     System.out.println(5/3.0d);//
        //     System.out.println(5/3.0f);//

        //please store above number in variables
        //and replace above statement with variable instead
        //dataType result1 = the calculation here
        //System.out.println(result1);

        int number1 = 5;
        double number2 = 3.0d;
        float number3 = 3.0f;

        double result1 = number1 + number2;
        double result2 = number1 - number2;
        double result3 = number1 * number2;
        double result4 = number1 / number2;
        float result5 = number1 / number3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        double fahrenheit = 80;
        double celsius;

        celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println(fahrenheit + "F equals to" + celsius + "C.");


    }
}
