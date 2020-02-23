package day34_Saturday;

public class Task_Akbar {

    public static void main(String[] args) {

        gregorianCalendar(1600);

         boolean ans ;
        System.out.println(gregorianCalendar1(1600));
    }
    //    In the Gregorian calendar three criteria must be taken into account to identify leap years:
//    The year can be evenly divided by 4;
//    If the year can be evenly divided by 100, it is NOT a leap year, unless;
//    The year is also evenly divisible by 400.  Then it is a leap year.
//    Write a method
    public static int gregorianCalendar(int year){
        if (year%4==0 && year%400==0){
            System.out.println("leap years");
            return year;
        }else {
            System.out.println("not leap year");
            return 0;
        }
    }
   public static boolean gregorianCalendar1(int year1){

        if (year1%4 ==0 && year1%400==0){
            return true;
        }else {
            return false;

        }
    }
}