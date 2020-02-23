package repl_it_Assignments;

import java.util.Scanner;

public class P80_BuildARoute {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

if (start==end){
    System.out.println("end variable found");
}else {
    while (start!=end){
        if (start=="A"){
            start = "B";
            System.out.println("right");
        }else if (start == "B"){
            start="C";
            System.out.println("down");
        }else if (start == "C"){
        start="D";
        System.out.println("left");
    }else if (start == "D"){
            start="A";
            System.out.println("up");
        }
        if (start !=end){
            System.out.print(" > ");
        } else {
            System.out.println("end variable found");
        }
    }

}

    }
}
