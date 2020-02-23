package day34_Saturday;

import day31_Saturday.Calculator;

import java.util.Arrays;

public class MathAction {

    // calling the static methods of other classes

    public static void main(String[] args) {

        // call your build3DigitNumbers method here
        //build3DNumbers is under day34_Saturday package
        // and inside PracticeMethodWithNumbers class

        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6,4,0);

        System.out.println("result1= " + result1);


        int [] nums= {2,5,87};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));


        // calling  Calculator class in day31 package:

        Calculator.calculate(10,20,'-'); //click on method name "calculate"
                                                                // to see in detail
                                                                //"option " plus "space"


    }
}
