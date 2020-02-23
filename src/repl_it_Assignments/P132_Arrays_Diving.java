package repl_it_Assignments;

import java.util.Scanner;

public class P132_Arrays_Diving {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        float max= score[0];

        for (int i = 0; i < score.length; i++) {
            if(max < score[i]){
                max = score[i];
            }
        }

        float min = score[0];
        for (int i = 0; i <score.length ; i++) {
            if(min>score[i]){
                min = score[i];
            }
        }

        int sum =0;
        for (int x = 0; x < score.length ; x++) {
            sum+= score[x];
            sum++;
        }



        // FINAL OUTPUT
      //  System.out.printf("Total: %.2f", total);

    }
}
