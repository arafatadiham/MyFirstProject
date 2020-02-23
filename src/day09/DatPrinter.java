package day09;

public class DatPrinter {

    public static void main(String[] args) {

        int dayCode= 7;

        if (dayCode==1) {
            System.out.println("Day is Monday!");
        } else if (dayCode == 2) {
            System.out.println("Day is Tuesday");
        } else if (dayCode == 3) {
            System.out.println("Day is Wednesday");
        } else if (dayCode == 4) {
            System.out.println("Day is Thursday");
        } else if (dayCode == 5) {
            System.out.println("Day is Friday");
        } else if (dayCode == 6) {
            System.out.println("Day is Saturday");
        } else if (dayCode == 7) {
            System.out.println("Day is Sunday");
        } else {
            System.out.println("Day is Unknown");
        }

// The second way to do : *******************************

        String dayName= "";  //----> assigning an empty String value

        if (dayCode == 1) {
            dayName = "Monday";
        } else if (dayCode == 2) {
            dayName = "Tuesday";
        } else if (dayCode == 3) {
            dayName = "Wednesday";
        } else if (dayCode == 4) {
            dayName = "Thursday";
        } else if (dayCode == 5) {
            dayName = "Friday";
        } else if (dayCode == 6) {
            dayName = "Saturday";
            System.out.println("YAY@@@ SATURDAY@@");
        } else if (dayCode == 7) {
            dayName = "Sunday";
            System.out.println("WATCH FOOTBAL@@@@!!!");
        } else {
            dayName = "UNKNOWN!!!";
            //System.out.println("Day is Unknown");
        }

        System.out.println("Day is " + dayName);
    }
}
