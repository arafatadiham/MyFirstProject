package repl_it_Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P215_MethodsArrayList2Times {
    public static void main(String[] args) {

        List<Integer> sample = Arrays.asList(2,3,8,4);
        ArrayList <Integer> Testing = new ArrayList<>(sample);//----> this needs call (sout) Testing
        System.out.println(twoTimes(Testing));

        // one shot solution will be:                            //0 1 2 3
        ArrayList<Integer> oneShot = new ArrayList<>(Arrays.asList(2,4,6,9));
        System.out.println(twoTimes(oneShot));                //   2,2,4,4,6,6,9,9
                                                    //             0 1 2 3 4 5 6 7
    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<>(numbers);

        for (int i = 0; i < newList.size(); i += 2) {
            newList.add(i, newList.get(i));
        }

        return newList;


    }
}