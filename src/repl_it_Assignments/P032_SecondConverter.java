package repl_it_Assignments;
import java.util.Scanner;
public class P032_SecondConverter {

    public static void main(String[] args) {


     Scanner scan=new Scanner (System.in);

        System.out.println("Enter seconds:");

        int inputSecond = scan.nextInt();

        int hours= inputSecond/3600;
        int hoursRemainder= inputSecond%3600;

        int minutes= hoursRemainder/60;
        int minutesRemainder=hoursRemainder%60;

        int seconds= minutesRemainder%60;

        System.out.println(hours+ "hours, "+ minutes+" minutes, and "+seconds+" seconds");


        double num=7695%3600;
        System.out.println(num);

    }
}
