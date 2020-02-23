package day10;

public class SeasonAction {
    public static void main(String[] args) {


        /*
         * What do you do in each season
         *
         * Spring -->>> Hike ! Easter , Nawruz, Blossom
         * Summer -->>> Swim , Vacation , BBQ , Holiday
         * Fall   -->>> Black Friday , Hiking , Harvest , Halloween , Shopping
         * Winter --->> Snowboarding , Ski , Chritmas , New Year
         *
         * */

        String season =  "Winter";

        switch (season){
            case "Fall":
                System.out.println(" black Friday, Harvest, Halloween, Shopping");
              break;

            case "Summer":
                System.out.println(" Swimming");
                break;

            case "Spring":
                System.out.println(" Nowruz");
                break;
            case "Winter":
                System.out.println(" Skiing");
                break;
            default:
                System.out.println(" No other season!");
        }

    }
}
