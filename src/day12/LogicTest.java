package day12;

public class LogicTest {

    public static void main(String[] args) {

        String userName = "user 123";
        String passWord = "pass 123";

        if ( userName .equals ("user 123") && passWord.equals ("pass 123")){
            System.out.println("Correct");
        } else if (! userName.equals("user 123") && passWord.equals ("pass 123")){
            System.out.println("Wrong User Name");
        } else if ( userName.equals("user 123") && ! passWord.equals ("pass 123")) {
            System.out.println("Wrong Password");
        } else {
            System.out.println(" UserName and PassWord are both Wrong!");
        }
    }
}
