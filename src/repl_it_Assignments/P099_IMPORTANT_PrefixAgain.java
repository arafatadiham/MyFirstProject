package repl_it_Assignments;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class P099_IMPORTANT_PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        int n = scan.nextInt();

        //0123456----index
        //abXYabc
        //1234567---->length

        int length = str.length();

        int counter=0;
        boolean outPut = true;

        for (int x = 0; x <= length - n; x++) {
           String nValue= str.substring(0,n);

            if (nValue.equals(str.substring(x,x+n))) {
                counter++;
            }
        }
        if (counter >= 2) {
            //  System.out.println("it appeared " + counter + " times");
            System.out.println(outPut = true);
        } else if (counter <= 1) {
            // System.out.println("it appeared once only ");
            System.out.println(outPut = false);
        }
    }
}
