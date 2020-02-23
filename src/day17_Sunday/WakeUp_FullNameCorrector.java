package day17_Sunday;

public class WakeUp_FullNameCorrector {

    public static void main(String[] args) {

        String fullName= "arYa sTark";

         String firstName= fullName.substring(0,4);
         String lastName= fullName.substring(5);

         //  String firstName= fullName.substring(0,indexOfSpace);
        //String lastName= fullName.substring(indexOfSpace + 1);

         String firstNameCorrected= firstName.toUpperCase().substring(0,1) +
                                    firstName.toLowerCase().substring(1);

        System.out.println(firstNameCorrected);

        String lastNameCorrected= lastName.toUpperCase().substring(0,1) +
                lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);

        fullName= firstNameCorrected+" "+ lastNameCorrected;

        System.out.println(fullName);

    }
}
