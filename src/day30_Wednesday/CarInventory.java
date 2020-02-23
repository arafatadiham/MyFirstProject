package day30_Wednesday;

public class CarInventory {
    public static void main(String[] args) {

        String[] cars = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic",
                "Lexus-LS",
                "Mazda-MX-5"};

        // Task1: count Chevrolet and civic

        //First way to do this :

        System.out.println("************First way to do this*******");

        int countOfCivic = 0;
        int size = cars.length;

        for (int i = 0; i < size; i++) {
            if (cars[i].contains("Civic")) {
                countOfCivic++;
            }
        }
        System.out.println("Count Of Civic = " + countOfCivic);

        int countOfChevrolet = 0;

        for (int i = 0; i < size; i++) {
            if (cars[i].contains("Chevrolet")) {
                countOfChevrolet++;
            }
        }
        System.out.println("Count Of Chevrolet = " + countOfChevrolet);


        // Second way to do this:
        System.out.println("\n************The second way to do this*******");

        int ChevyCNT= 0;
        int civicCNT=0;


        for (String eachCar : cars){
            if (eachCar.toLowerCase().startsWith("chevrolet")){
              ChevyCNT++;
            }
            if (eachCar.toUpperCase().contains("CIVIC")){
                civicCNT++;
            }
        }

        System.out.println("ChevyCNT : "+ ChevyCNT);
        System.out.println("civicCNT : "+ civicCNT);


        // TASK 2: Print all location of civic:

        System.out.println("\n************TASK 2*******");

        for (int x = 0; x < cars.length; x++) {
            if(cars[x].contains("Civic")){
                System.out.println("Civic found at location: " + x);
            }

        }


        System.out.println("\n************TASK 3*******");
        // TASK 3: Print Make and Model separately in this format;
        // for example:
        //Honda-Civic -->>
            //Car make is Honda and Model is Civic
        // print only Honda brand cars

//      String eachCar =  "Honda-Civic";
//
//      String [] eachCarSplitted = eachCar.split("-");
//
//        System.out.println(" Car make is  " + eachCarSplitted[0] + "Car Model is "+ eachCarSplitted[1]);

        for (String eachCar: cars){
            if (eachCar.startsWith("Honda")){
                String [] eachCarSplitted = eachCar.split("-");
      System.out.println(" Car make is  " + eachCarSplitted[0] + ", Car Model is "+ eachCarSplitted[1]);

            }
        }

        System.out.println("\n************TASK 4*******");
        // TASK 4: FIND ALL THE CAR WITH model has only 2 characters
        //print them out
        // get the count

        int cntOF2CharModel=0;

        for (String eachCar:cars){
            String [] eachCarSplitted = eachCar.split("-",2);
            String model = eachCarSplitted[1];
          //  if(eachCarSplitted[1].length()==2) {
            if(model.length()==2){
                cntOF2CharModel++;
                System.out.println("Car with Model has only 2 Characters: " + eachCar);
            }
        }

    }
}