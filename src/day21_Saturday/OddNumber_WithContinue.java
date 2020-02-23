package day21_Saturday;

import java.sql.SQLOutput;

public class OddNumber_WithContinue {

    public static void main(String[] args) {


        //Continue means -----> Skipper of the chain ; It is actually =="Skip"
        // Break means -----> Break of the chain

        for (int x=1; x<=10; x++){
           if (x % 2 ==1) {
                continue;
            }
            System.out.println(x);
        }


        System.out.println("");
        System.out.println("******TASK 2*****");
        System.out.println("");

        for (int i=1; i<= 100; i++){
            if (i % 5 ==0){
                System.out.println("Skipping " + i);
                continue;
            }
            System.out.println(i);
        }

    }
}
