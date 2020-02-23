package repl_it_Assignments;

import java.util.Scanner;

public class P087_Zombies_ForLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter the number for inhabitants: ");
        int inhabitants = scan.nextInt();

        for (int i = 0; i < 1000000; i++) {

            System.out.println("Day " + i + " " + "[" + (inhabitants) + "]");
            inhabitants = inhabitants / 2;
            if (inhabitants == 0){
                System.out.println("---EXTINCT---");
                break;
            }
        }

    }
}
