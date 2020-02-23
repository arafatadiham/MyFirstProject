package repl_it_Assignments;

import java.util.ArrayList;

public class P197_ArrayListAddItem {
    public static void main(String[] args) {

        ArrayList<String> word1 =new ArrayList<>();
        test(word1);
    }
    public static void test(ArrayList<String> words) {
        //write code here
        words.add("arafat");
        words.add("asat");
        words.add("erfan");
        words.add("alex");
        words.add(0, "hey");
        words.add(3, "yo");
        System.out.println(words);

    }
}