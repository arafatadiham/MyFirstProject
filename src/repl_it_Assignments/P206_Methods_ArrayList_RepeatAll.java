package repl_it_Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class P206_Methods_ArrayList_RepeatAll {

    public static void main(String[] args) {

        ArrayList <Boolean> name = new ArrayList<>(Arrays.asList(false,true,true));
       repeatAL(name);

    }

    // Create your method here:

    public static void repeatAL (ArrayList<Boolean> newList){



        newList.addAll(newList);

        System.out.println(newList);

    }



}
