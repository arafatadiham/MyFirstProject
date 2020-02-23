package day30_Wednesday;

import java.util.Arrays;

public class SplitWithDefineTheSize {
    public static void main(String[] args) {

        String car = "Lexus-IS-F";

        String[] carSplitted = car.split("-", 2);//-----> We can use limit option to split by 2 pieces;
        System.out.println("carSplitted= " + Arrays.toString(carSplitted));
        System.out.println("car: " + car);

        String model = carSplitted[1];
        System.out.println("model = " + model);

    }
}
