package day10;

public class Calculator_V1_JustPrint {

    public static void main(String[] args) {
        char operator = '-';

        switch (operator) {
            case '+':

                System.out.println("  If the operator is " + operator + "print you are about to add numbers!");
                break;
            case '-':

                System.out.println("  If the operator is " + operator + "print you are about to subtract numbers!");
                break;
            case '*':

                System.out.println("  If the operator is " + operator + "print you are about to multiply numbers!");
                break;
            case '/':

                System.out.println("  If the operator is " + operator + "print you are about to divide numbers!");
                break;
            default:
                System.out.println(" Invalid Operator!");
                break;
        }

    }

}
