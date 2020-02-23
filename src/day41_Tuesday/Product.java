package day41_Tuesday;

// Make this Product a well encapsulated
// make all the instance fields private so it can only be accessible in same class
// provide public getters and setters method

public class Product {


    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {

        if (newPrice > 0) {
            price = newPrice;
        }
//
//        public void setPrice ( double price){
//            this.price = price;
//        }
//

//            public String getName() {
//
//        return this.name;
//        //return name;
//    }
//
//    public void setName(String name) {
//        //name = newName;
//        this.name = name ;
//    }
//
//    public double getPrice() {
//        return this.price;
//    }
//
//    public void setPrice(double price) {
//
//        if (price > 0) {
//            this.price = price;
//        }

    }



}
