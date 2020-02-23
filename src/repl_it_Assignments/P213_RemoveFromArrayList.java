package repl_it_Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class P213_RemoveFromArrayList {

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
        //write your code here;
        for (int i = 0; i < r.size(); i++) {
            if(r.get(i)==n){
                r.remove(i);
                i--;
            }
        }

        return r;
    }
        public static void main(String[] args) {
        //Below are given by instructor;
            ArrayList<Integer>  arr = new ArrayList<>();
            Integer[] nums = new Integer[]{1,1,2,3};
            arr.addAll(Arrays.asList(nums));

            System.out.print(removeInst(arr,1));




        }
}
