package day58_Wednesday;

public class RunTimeError {

    static int num = 0;

    public static void main(String[] args) {


        num++;
        System.out.println("num = " + num);
        //call main method again
        main(null);

    }
}
