package Tasks_Akbar;

public class Email_UpperCaseFirstChar {

    public static void main(String[] args) {
        String email = "alex_turhun@gmail.com";
        String s1 = email.substring(0, 5).replaceFirst("alex","Alex");
        //int t = email.indexOf("tur");
        String s = email.substring(5).replace("t", "T");
        System.out.println(s1 + s);

    }
}
