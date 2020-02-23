package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        //int speedLimit= 60;

        int yourCurrentSpeed = 78;

        if (yourCurrentSpeed >= 100) {
            System.out.println("You go to jail!");
        } else if (yourCurrentSpeed >= 90) {

            System.out.println(" 6 point will deduct from your total point!");
        } else {
            System.out.println(" good to go!");

        }
    }
}