package day10;

public class MultiBranch_WithSwitch_McDonalds {
    public static void main(String[] args) {

        // Here are the only data type that Switch accept :
        // byte, short, int, char, String

        String order = "";

        int itemNumber = 11;

        switch (itemNumber) {

            case 11 :
                System.out.println("You have selected 11");
                order = "Burger";
                break; // if Break is NOT shows up here, it will just move on to next case!!!! so DO NOT FORGET BREAK!!!
            case 5 :
                System.out.println("You have selected 5");
                order = "French Fry";
                break;
            case 8 :
                System.out.println("You have selected 8");
                order = "Nuggets";
                break;
            case 35 :
                System.out.println("You have selected 35");
                System.out.println("YAY!!! YUM!!! ");
                System.out.println("ENJOY!!!! ");
                order = "Ice Cream";
                break;
            default:
                System.out.println("YOU HAVE SELECTED Unknown ITEM NUMBER@!!");
                order = "Unknown" ;
                break;
        }
        System.out.println("Your order is " + order);

        }

    }


