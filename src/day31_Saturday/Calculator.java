package day31_Saturday;

public class Calculator {
    public static void main(String[] args) {
        //       char operator='+';
//        int num1=15;
//        int num2=3;
        calculate(10,20,'-');
        calculate(10,30,'+');
        calculate(10,5,'*');
        calculate(10,2,'/');
        calculate(10,2,'A');
    }
    public static void calculate( int num1,int num2,char operator){
        switch (operator){
            case'+':
                System.out.println("result " +(num1+num2));
                break;
            case'-':
                System.out.println("result " +(num1-num2));
                break;
            case'*':
                System.out.println("result " +(num1*num2));
                break;
            case'/':
                System.out.println("result " +(num1/num2));
                break;
            default:
                System.out.println("operator ");
        }
    }
}
