package day21_Saturday;

public class Important_DecidingWhenToStop {

    public static void main(String[] args) {

        //            01234567890
        String msg = "Hello World";
        //            12345678901
        int charCount = msg.length();

        int n= 4;

        for (int x=0; x<=charCount-n; x++){
            System.out.println(msg.substring(x,x+n));
        }

    }
}
