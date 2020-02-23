package repl_it_Assignments;

import java.util.ArrayList;

public class P198_CombineALL_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> W1 = new ArrayList<>();
        ArrayList<String> W2 = new ArrayList<>();
        System.out.println(combineAL(W1,W2));

    }

    public static ArrayList <String> combineAL (ArrayList<String>wordList1, ArrayList<String> wordList2){

      //  ArrayList<String> WordList1 = new ArrayList<>();
        wordList1.add("Orange");
        wordList1.add("Apple");
        wordList1.add("Banana");

  //      ArrayList<String> WordList2 = new ArrayList<>();
        wordList1.add("Pearls");
        wordList1.add("WaterMellon");

        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(wordList1);
        newArrayList.addAll(wordList2);

        return newArrayList;
    }

}
