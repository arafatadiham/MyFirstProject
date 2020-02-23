package day57_Tuesday;

public class ExceptionExample {
    public static void main(String[] args) {

        System.out.println("Hello B15 Online Friends");
      //  int num = 2.5; // this will give you Compiler Error

        int [] nums = new int [3];
        nums [0] = 55;
        nums [1] = 56;
        nums [2] = 100;

       // nums [3] = 200; //This Does NOT gives you compiler error, BUT this will gives you "ArrayIndexOutOfBoundsException"

      //  System.out.println("Bye Bye B15 Student "); // you won't get this when it runs

        int result = 10 /0; // This Does NOT gives you compiler error
        System.out.println(result); // but this will gives you "java.lang.ArithmeticException"


    }
}
