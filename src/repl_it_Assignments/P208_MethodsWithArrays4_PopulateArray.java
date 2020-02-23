package repl_it_Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P208_MethodsWithArrays4_PopulateArray {

    public static int[] populate(int[] r)
    {

    //Write your code here;

        for (int x = 0; x< r.length; x++){
        r[x]= x + 1;
        }

        return r;
    }



    public static void main(String[] args) {


        int [] i= new int[3];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));


    }

}
