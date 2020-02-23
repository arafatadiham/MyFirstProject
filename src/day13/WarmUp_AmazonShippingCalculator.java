package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        String memberType= "Prime member";
        double amount =  15.99d;
        int shippingFee ;


        if(memberType .equalsIgnoreCase("Prime member")){
            System.out.println("Your get free shipping fro your purchase");
            System.out.println("Your final price is " + amount);
        } else if (amount >= 25){
            System.out.println("You spent more than $25, so you get free shipping fro your purchase");
        } else {
            System.out.println("Do you want to sign up for Prime Membership?");
            shippingFee = 5;
            amount = amount + shippingFee; // amount += shippingFee
            System.out.println("Your Final Amount is " +amount);
        }

    }


}
