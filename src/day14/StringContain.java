package day14;

public class StringContain {

    public static void main(String[] args) {

        String str = "I like Pumpkin";
        System.out.println("Does it contains Pumpkin:");
        System.out.println( str.contains("Pumpkin"));
        System.out.println( str.contains("Pum"));

        // true
        boolean gotPumpkin =  str.contains("Pumpkin") ;
        //shortcut to print variable value in nice format soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith  endsWith
        // check whether a string start with another string
        // check whether a string end with another string
        // and return true or false result

        boolean startWithI = str.startsWith("I");
        System.out.println("startWithI = " + startWithI);

        boolean endWithPumpkin= str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);

        // Password validator



        String password = "ASH2723gfgdsu";






    }
}
