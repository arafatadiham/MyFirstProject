package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {

        // At the mcdonald Drive Thru

        System.out.println("Welcome to McDonald's!");

        /*

         11, Burger
        12, french Fries
        8 Nuggets
        35, Ice Cream
        55, Coke

         */

        String order = "";
        int itemNumber = 12;

        if (itemNumber == 11) {
            System.out.println(" You have select 11");
            order = "Burger";
        } else if (itemNumber == 12) {
            System.out.println(" You have select 12");
            order = "french Fries";
        } else if (itemNumber == 8) {
            System.out.println(" You have select 8");
            order = "Nuggets";
        } else {
            System.out.println(" You have selected unknown item!");
            order ="Unknown";
        }
        System.out.println(" your order is " + order);
    }
}
