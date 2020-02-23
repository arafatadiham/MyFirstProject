package repl_it_Assignments;

public class P091_PrintZ_V {
    public static void main(String[] args) {


        for (char kchar = 'z'; kchar >= 'v'; kchar--)
            for (char ichar = 'z'; ichar >= 'v'; ichar--){
                System.out.print(kchar + "");
                System.out.println(ichar + "");
            }
    }
}