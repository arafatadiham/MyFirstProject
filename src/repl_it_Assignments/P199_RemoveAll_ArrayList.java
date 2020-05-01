package repl_it_Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P199_RemoveAll_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>(Arrays.asList("hi", "hey", "hi", "yo"));

        removeAll(words,"hi");

    }

    public static void removeAll (ArrayList < String > wordList, String targetWord ){

        wordList.removeAll(Arrays.asList(targetWord));
        System.out.println(wordList);


            }
        }
