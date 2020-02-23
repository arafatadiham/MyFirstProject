package day21_Saturday;

public class LoopControlStatement {

    public static void main(String[] args) {

       // for (int i=1; i<=10; i++){
      //      System.out.println(i);
       //     if (i==5) {
       //         break;
       //     }
     //   }


        System.out.println("****************");

        int sum =0;

        for (int i=1; i <=10; i++){
            System.out.println("Final sum is " + sum);

            if (sum + i> 40) {
                break;
            }
            // We need to add the sum after we make sure it didn't go over 40
            sum= sum + i ;
        }

        System.out.println("Sum = " + sum);

    }
}
