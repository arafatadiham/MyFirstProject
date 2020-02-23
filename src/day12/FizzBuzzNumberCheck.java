package day12;

import org.w3c.dom.ls.LSOutput;

public class FizzBuzzNumberCheck {

    public static void main(String[] args) {

        int num = 45;

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("FIZZ BUZZ NUMBER!");
        } else if (num % 5 == 0) {
            System.out.println("FIZZ NUMBER!");
        } else if (num % 3 == 0) {
            System.out.println("BUZZ NUMBER!");
        } else {
            System.out.println("Not Number Number!");
        }
    }
}


