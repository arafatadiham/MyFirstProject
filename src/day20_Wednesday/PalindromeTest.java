package day20_Wednesday;

public class PalindromeTest {
    public static void main(String[] args) {

        // if you reverse a String if it does not change
        //it means the string is Palindrome

        // level , kayak, elle, madam, aziza

        String name = "Kayak";
        System.out.println("name = " + name);

        String reversedName = "";

        for (int x = name.length()-1 ; x >= 0 ; x-- ) {

            reversedName = reversedName + name.charAt(x);
        }

        System.out.println("reversedName = " + reversedName);

        // MAKE THIS code does NOT care space while checking
        // check whether reversed name is equal without case checking

        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed!");
        } else {
            System.out.println("Palindrome test has failed!");
        }

    }
}
