package day09;

public class LanguagePicker {

    public static void main(String[] args) {

        int languageOption = 2;
        String greeting = "";

        if (languageOption == 1) {
            greeting = "Hello";
        } else if (languageOption == 2) {
            greeting = "Salam";
        } else if (languageOption == 3) {
            greeting = "Hola";
        } else if (languageOption == 4) {
            greeting = "Privet";
        } else if (languageOption == 5) {
            greeting = "Merhaba";
        } else if (languageOption == 6) {
            greeting = "Szia";
            System.out.println("YAY@@@ SATURDAY@@");
        } else if (languageOption == 7) {
            greeting = "Bonjour";
            System.out.println("WATCH FOOTBAL@@@@!!!");
        } else {
            greeting = "UNKNOWN!!!";
        }
            System.out.println(greeting + ", SDET");

    }
}
