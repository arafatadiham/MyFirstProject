package day18_Monday;

public class RemoveChar_OfficeHour {
    public static void main(String[] args) {

        String letter="J%A^V**$1a";
        // remove %^*1$

        letter= letter.replace("%","")
                .replace("^","")
                .replace("*","")
                .replace("1","")
                .replace("$","")
                .toUpperCase();

        System.out.println("letter = "+ letter);
    }
}
