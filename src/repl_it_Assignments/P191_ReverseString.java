package repl_it_Assignments;

public class P191_ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("Arafat"));

    }
    public static String reverse(String input)
    {
        String reversed= "";

        for (int i = input.length()-1; i >=0 ; i--) {
            reversed = reversed + input.charAt(i);
        }

        return reversed;
    }
}
