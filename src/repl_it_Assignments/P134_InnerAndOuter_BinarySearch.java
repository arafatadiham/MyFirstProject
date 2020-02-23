package repl_it_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class P134_InnerAndOuter_BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE

        boolean contains = true;

        for(int i =0; i < sizeInner; i++) {
            int indexLocation= Arrays.binarySearch(outer,inner[i]);
            if(indexLocation>=0){
                contains= true;
            }else {
                contains= false;
            }
        }
        System.out.println(contains);
    }
}
