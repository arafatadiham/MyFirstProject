package repl_it_Assignments;

import java.util.ArrayList;
import java.util.List;

public class P196_RemovingNumberFromArraylist {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(9);
        nums.add(2);
        nums.add(5);
        System.out.println("nums = " + nums);
       // for (int i = 0; i < nums.size(); i++) {
        for (int i = 0; i < 2  ; i++) {
            nums.remove(0);
         //  if (i==1){
          //     break;
           }
      //  }

        System.out.println("nums = " + nums);


    }
}