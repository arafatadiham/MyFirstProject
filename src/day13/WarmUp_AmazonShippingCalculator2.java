package day13;

public class WarmUp_AmazonShippingCalculator2 {

    public static void main(String[] args) {

        boolean youWantToShop = true;
        String preference = "Store";

        if (youWantToShop == true) {
            if (preference.equals("Store")) {
                System.out.println("Going to store for shopping");
            } else {
                System.out.println("Going to online shopping!");
            }
        } else {
            System.out.println("good job stay at home!");
        }

    }

}
