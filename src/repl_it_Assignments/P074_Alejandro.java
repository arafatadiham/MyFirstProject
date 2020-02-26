package repl_it_Assignments;

import java.util.Scanner;

public class P074_Alejandro {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter email: ");
        String a = s.nextLine();

        if (a.contains("alejandro")){
            System.out.println("read this mail");
        } else {
            System.out.println("dont read");
        }


    }

}
