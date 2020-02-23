package repl_it_Assignments;

public class P184_InsertAt3rdChar {
    public static void main(String[] args) {
        System.out.println(at3("longword","foo"));



    }

    public static String at3(String target,String word)
    {
            String lon=target.substring(0,3);
            String gword= target.substring(3);

        return lon + word + gword;
    }
}
