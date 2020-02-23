package repl_it_Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P199_RemoveAll_ArrayList {
    public static void main(String[] args) {

       ArrayList<String>wordList = new ArrayList<>();

       // removeAll(wordList,targetWord);

        removeAll(wordList,"hi");

    }

    public static void removeAll (ArrayList<String> wordList, String targetWord ) {

        List<String> word= new ArrayList <String> (Arrays.asList("hi", "hey","hi", "yo"));
        removeAll(wordList,"hi");
       // word.removeAll(Arrays.asList("hi"));
        System.out.println(word);
    }

}
