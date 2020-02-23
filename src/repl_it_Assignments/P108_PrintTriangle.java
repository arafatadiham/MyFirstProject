package repl_it_Assignments;

import java.util.Scanner;

public class P108_PrintTriangle {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (int j1 = 0; j1 < n; j1++) {

            for (int i1 = 0; i1 <= j1; i1++) {

                System.out.print("*");
            }

            System.out.println();

        }
    }
}