package repl_it_Assignments;

public class P203_MethodWithString_Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Race car"));

    }

    public static boolean isPalindrome(String check) {

        boolean result = false;
        String reverse= "";
        String WordCheckWithoutSpace= check.replace(" ", "");


        for (int i = WordCheckWithoutSpace.length()-1; i >= 0; i--) {
            reverse = reverse + WordCheckWithoutSpace.charAt(i);
            if(reverse.equalsIgnoreCase(WordCheckWithoutSpace)){
                return result=true;
            }
        }


        return result;
    }

}
