package repl_it_Assignments;

public class P179_RemoveDuplicate {
    public static void main(String[] args) {

        System.out.println(uniqueChars("Spoonnueufe"));

    }

    public static String uniqueChars(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String subStringAfteri = str.substring(i+1,str.length());
            if ( !subStringAfteri.contains((c)+"")) {
                result = result + c;
            }
        }
        return result;
    }
}
