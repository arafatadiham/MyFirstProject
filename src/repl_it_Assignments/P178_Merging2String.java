package repl_it_Assignments;

public class P178_Merging2String {
    public static void main(String[] args) {

        String A = "Pine";
        String B = "12345678";

        String Merging = "";
/*
for (int i = 0; i < A.length(); i++) {
            if (B.length()>A.length())
            Merging = Merging + A.charAt(i);

            for (int j = 0; j < B.length(); j += B.length()) {
                Merging = Merging + A.charAt(j);
            }


            }
            System.out.println(Merging);

 */

        for (int i = 0; i <B.length() ; i++) {

            for (int j = 0; j < A.length(); j++) {
                Merging = A.charAt(i) + "" + B.charAt(j);
            }
            System.out.print(Merging);
        }

        }



    public static String mergeStrings(String one, String two) {



        return "";
    }

}