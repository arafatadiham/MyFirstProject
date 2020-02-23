package day11;

public class TrueAndFalse_Practice {

    public static void main(String[] args) {

        int score= 19;
        if (score <0 || score>100){
            System.out.println("Invalid Score!");
        } else if ( score==100){
            System.out.println("Prefect score!");
        } else if (score>70 && score<100) {
            System.out.println("You have passed!");
        } else if (score>40 && score<70) {
            System.out.println("little bit more study will let you pass!");
        } else if (score>30 && score<40) {
            System.out.println("Attending additional classes!");
        } else if (score<20) {
            System.out.println("come to my office!");
        } else {
            System.out.println("You have failed!");
        }


    }
}
