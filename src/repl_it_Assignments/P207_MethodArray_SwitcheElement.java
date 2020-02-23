package repl_it_Assignments;

import java.util.Arrays;

public class P207_MethodArray_SwitcheElement {

    public static void main(String[] args) {

        int [] newArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(do_switch(newArray)));

    }


    public static int[] do_switch(int[] i) {

        //Write your code here:

      int temp =  i [0];
      i[0]= i[i.length-1];
      i[i.length-1]=  temp;



        return i;
    }


}
