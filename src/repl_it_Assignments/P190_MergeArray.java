package repl_it_Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class P190_MergeArray {

    public static int[] mergR(int[] a,int[] b) {

        int length = a.length + b.length;

        int[] mergeArray = new int[length];
        for (int i = 0; i <a.length ; i++) {
            mergeArray[i]=a[i];
        }

        for (int i = 0; i <b.length ; i++) {
            mergeArray[i+a.length] = b[i];
        }
        return mergeArray;
    }//end mergR

    public static void main(String[] args) {

        int[]num1 = {1,2,3};
        int[]num2={4,5,6,7};

        System.out.println(Arrays.toString(mergR(num1, num2)));

    }

}
