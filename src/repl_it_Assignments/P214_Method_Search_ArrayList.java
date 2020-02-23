package repl_it_Assignments;

import java.util.ArrayList;

public class P214_Method_Search_ArrayList {
    public static void main(String[] args) {
        //Below are given by instructor;
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr, "foo");
        System.out.print(find_tst);//foo bar

    }

    public static String search(ArrayList<String> r, String find) {
        //Write your code here:
        for ( String each : r){
            if (each.contains(find)){
               return each;
            }

        }


        return "search failed";
    }
}