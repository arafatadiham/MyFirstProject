package repl_it_Assignments;

import java.util.ArrayList;
import java.util.List;

public class P195_ArraylistSizeGet {

    public static void main(String[] args) {
        ArrayList<Integer> ints1 =new ArrayList<>();
        ints1.add(5);
        ints1.add(6);
        ints1.add(8);
        ints1.add(9);
        ints1.add(2);
        System.out.println(ints1);
        System.out.println(sum(ints1));

        //if we use List instead of ArrayList , we need to :


    }

    public static int sum(ArrayList<Integer> ints)
    {
        //write code here

        int sum = 0;
        for (int i=0; i<ints.size(); i++){
            sum= sum + ints.get(i);
        }
        return sum;
    }

}
