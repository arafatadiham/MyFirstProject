package day09;

public class SwitchPractice {

    public static void main(String[] args) {


    // use day 9, DayPrinter code , turn all of them to Switch
        // Switch statement is only can use when to check for equality

    int dayCode = 7;

    switch (dayCode) {
        case 1:
            System.out.println("Day in Monday!");
            break; // used to get out of this branch
        case 2:
            System.out.println("Day in Tuesday!");
            break;
        case 3:
            System.out.println("Day in Wednesday!");
            break;
        case 4:
            System.out.println("Day in Thursday!");
            break;
        case 5:
            System.out.println("Day in Friday!");
            break;
        case 6:
        System.out.println("Day in Saturday!");
        break;
        case 7:
            System.out.println("Day in Sunday!");
            break;
        default:
            System.out.println("Day is unknown!");
    }
    }

}
