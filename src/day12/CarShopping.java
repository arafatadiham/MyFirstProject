package day12;

public class CarShopping {
    public static void main(String[] args) {

        // buy corolla or Tesla (only if it is within budget)

        // there is only one car covered with cloth
        // We don't know what car it is and what the price is
        //We check if it is toyota, if it is we buy it without checking the price
        // if it is not we check if  it is a Tesla and also check if it is within the budget

        String carBrand= "corolla";

        int budget =  40000;
        int carPrice= 60000;


        if (carBrand.equals("corolla") || carBrand .equals("Tesla") && carPrice <= budget){
            System.out.println("CAR ACQUIRED");
        } else {
            System.out.println("NOT WHAT I AM LOOKING FOR!");
        }

        // We use .equals for String equality. but, I am wondering what is inequality for String ?


    }
}
