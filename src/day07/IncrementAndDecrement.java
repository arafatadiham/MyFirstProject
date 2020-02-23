package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int apple= 10;


        ++ apple;  // ++ this is increase by 1 ---> it only can increase by 1, not 2, not 3
        ++ apple;// -----> 10+1=11 then we add 1 again ---> 11+1=12

        System.out.println(apple); // -----> see result  1

        -- apple;  // -- this is decrease by 1---> it only can decrease by 1, not 2, not 3
        apple -=3; // apple -(minus)=X is also decrease value by X

        System.out.println(apple);// -----> see result  2

        System.out.println(++apple);// -----> see result  3

        System.out.println("  used ++ to increase and concatenate : " +     ++apple); // -----> see result  4

    }
}
