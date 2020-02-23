package day20_Wednesday;

public class SumOfEvenOddSeparatly {

    public static void main(String[] args) {

        //  Give me the sum of odd numbers from
//  10 - 100 , use for loop

//// hint : create a variable sum as int
/// loop through 10-100
////  in each iteration check it's a even number or not
////  if it's add that number to sumOfEven
//    if it's add that number to sumOfOdd
//    eventually after the loop -->> print out sum value

        int sumOfEven= 0;
        int sumOfOdd = 0;

        for (int i= 10; i<=100 ; i++) {
            if(i%2==0) {
                sumOfEven = sumOfEven + i ;
            } else {
                sumOfOdd = sumOfOdd +i ;
            }
        }

        System.out.println("Sum of Even numbers = "+ sumOfEven);
        System.out.println("Sum of Odd numbers = "+ sumOfOdd);
    }
}
