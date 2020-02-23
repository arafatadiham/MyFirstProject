package day34_Saturday;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {


    public static void main(String[] args) {

       int [] resultArr = returnBoysVSGirlsResult();
        System.out.println(Arrays.toString(resultArr));

    }


    public static int [] returnBoysVSGirlsResult(){

        int [] boysGirlsCount = { 56 , 52  };

        return boysGirlsCount;
    }

}
