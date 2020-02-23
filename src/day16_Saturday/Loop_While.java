package day16_Saturday;

public class Loop_While {
    public static void main(String[] args) {

        int x= 0;

        // if you want to say "Happy birthday!" 5 times

        while(x<5) {
            System.out.println("happy Birthday!");
            ++x;
        }

        System.out.println("-----------------");

        int cnt = 1;
        while (cnt <= 5) {
            System.out.println("Hello World");
            System.out.println("cnt value is " + cnt);
            ++cnt; // increase the value by one
        }
        /* 1st time in the loop :  cnt = 1
           check this 1<=5 -->> true
                hello word
                cnt value is 1
                increase the cnt value to 2
           2nd time in the loop :  cnt = 2
           check this 2<=5 ---> true
                hello word
                cnt value is 2
                increase the cnt value to 3
           3rd time in the loop :  cnt = 3
           check this 3<=5 ---> true
                hello word
                cnt value is 3
                increase the cnt value to 4
           4th time in the loop :  cnt = 4
           check this 4<=5 ---> true
                hello word
                cnt value is 4
                increase the cnt value to 5
           5th time in the loop :  cnt = 5
           check this 5<=5 ---> true
                hello word
                cnt value is 5
                increase the cnt value to 6
           6th time in the loop :  cnt = 6
           check this 6<=5 ---> false
              GET OUT OF THE LOOP !!!!!!!!!!!
         */


    }

}
