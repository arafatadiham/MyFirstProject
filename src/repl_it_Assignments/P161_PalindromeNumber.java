package repl_it_Assignments;

import java.util.Scanner;

public class P161_PalindromeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        int reverseNumber=0;
        int originalNumber = num;
        while (num > 0 ) {
            //12 % 10 =2
            //125%10 =5
            //3%10 = 3
            int last_digit= num % 10; //434%10=4
            reverseNumber= reverseNumber * 10 + last_digit;
            num = num /10;
        }
        System.out.println(reverseNumber == originalNumber);
    }
}

