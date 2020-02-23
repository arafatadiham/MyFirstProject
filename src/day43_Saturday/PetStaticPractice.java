package day43_Saturday;

public class PetStaticPractice {

    public static void main(String[] args) {


        Pet.showGeneralPetInfo(); //---> this is a static method,
        // we don't need object to call

       // Pet.getName();------> This Does NOT work,
         //needs a Pet object
        //like this:

        Pet p1 =  new Pet("cat", "yumyum");
        System.out.println("p1 name = " + p1.getName());

    }

}
