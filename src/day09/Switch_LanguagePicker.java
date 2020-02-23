package day09;

public class Switch_LanguagePicker {

    public static void main(String[] args) {

        // please use all same DATA from Day 9, Class "language picker" , and turn them to Switch Statement!

        int languageOption = 4;
        String greeting = "";

        switch (languageOption) {
            case 1:
               greeting = "Hello!";
                break; // used to get out of this branch
            case 2:
                greeting = "Bonjour!";
                break;
            case 3:
                greeting = "hola!";
                break;
            case 4:
                greeting = "Yahximusiz!";
                break;
            case 5:
                greeting = "znie!";
                break;
            case 6:
                greeting = "cool!";
                break;
            case 7:
                greeting = "HAHAHAHA!";
                break;
            default:
                greeting = "unknown!";
        }

    }
}
