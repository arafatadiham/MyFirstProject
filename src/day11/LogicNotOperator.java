package day11;

public class LogicNotOperator {

    public static void main(String[] args) {

        System.out.println(!true);
        System.out.println(!false);

        boolean isRecording = false;

        System.out.println(! isRecording);

        // Third task :
        //You can use it in front of boolean expression
        // boolean expression is any expression that result in  boolean value
        // for exmple 7>5 , x>10, y==20,> x<1y, x>10 && x<100

        System.out.println(!(7 > 5));

        int x = 10;

        System.out.println( x> 10);

        System.out.println( !(x>10));





    }
}
