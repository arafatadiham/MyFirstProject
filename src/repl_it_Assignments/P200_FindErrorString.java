package repl_it_Assignments;

public class P200_FindErrorString {
    public static void main(String[] args) {

        //boolean result = isError("error has there");
        System.out.println(isError("cerror has there"));

    }

    public static boolean isError(String line) {

        //01234
       // error

        //return line.startsWith("error ");
        return line.substring(0,5).equals("error");
    }
}