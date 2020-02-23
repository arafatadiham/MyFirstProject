package day44_Sunday.sub;
import day44_Sunday.Vehicle;

public class Car extends Vehicle {



        // String make is not inherited, because it has default access modifier
        //default access modifier can only accept in the same package
        // private int year is not inherited !

        int mileage;

        public static void main(String[] args) {


            Car c1 = new Car();
            c1.mileage = 39637;
            System.out.println("c1.mileage = " + c1.mileage);

            c1.setYear(2016);
            System.out.println(" c1.getYear() = " + c1.getYear());


            c1.make = "Totoya Corolla";
            System.out.println("c1.make = " + c1.make);





        }



    }
