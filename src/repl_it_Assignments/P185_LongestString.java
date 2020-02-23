package repl_it_Assignments;

public class P185_LongestString {
    public static void main(String[] args) {

        System.out.println(biggerS ("orange", "applepineapple"));


    }

    public static String biggerS(String a ,String b) {


        if (a.length()>b.length()){
            return a;
        } else {
            return b;
        }


    }

}
