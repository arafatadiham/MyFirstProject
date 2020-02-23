package repl_it_Assignments;

import java.util.Scanner;

public class P098_countHi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //          1         2         3
        //01234567890123456789012345678901234 ----> index
        //hello hi and hi let us say hi again
        //         1         2         3
        //12345678901234567890123456789012345 ----> length

        int length = str.length();
        int lastIndexCha = length - 1;

        int count = 0;
        for (int x = 0; x < lastIndexCha; x++) {

            String wordHi = str.substring(x, x + 2);
            if (wordHi.equals("hi")) {
                count++;
            }
            //System.out.print(count);
        }
        System.out.print(count);
    }
}