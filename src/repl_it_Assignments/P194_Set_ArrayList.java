package repl_it_Assignments;

import java.util.ArrayList;
import java.util.List;

public class P194_Set_ArrayList {
    public static void main(String[] args) {


      System.out.println(test(new ArrayList<String>()));
    }

    public static List<String> test(ArrayList<String> words)
    {

        words.add("Orange");
        words.add("Apple");
        words.add("Banana");
        words.add("Pearls");
        words.add("WaterMellon");

        for (int i = 0; i < words.size(); i++) {
            if(i==0){
                words.set(0,"git");
            }
            if(i==2){
                words.set(2,"gud");
            }

        }
        return words;
    }

}
