package repl_it_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class P127_Array_ZombieAttack {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        //[3,6,0,4,3,2,7,1]

        System.out.println(Arrays.toString(inhabitants));

        int day = 1;
        while(true){ //infinite loop
            int sum = 0;
            for (int i = 0; i <inhabitants.length ; i++) {
                inhabitants[i]=inhabitants[i]/2;
                sum= sum + inhabitants[i];
            }
            System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
            day++;

            if(sum==0){
                break;
            }
        }
        System.out.println("---- EXTINCT ----");
    }
}
