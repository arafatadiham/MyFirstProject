package repl_it_Assignments;

public class P176_RoomBook {
    public static void main(String[] args) {

       boolean result = simpleRoomBook(true, 7, 2, 2018);

        System.out.println(result);
    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {


        if (!isAvailable ||  (month == 7 && day <= 8) || year != 2018) {
               return false;
        }
            return true;


    }
}