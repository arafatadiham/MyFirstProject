package repl_it_Assignments;

import java.util.Scanner;

public class P102_ParseHTML {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();


        int index= html.indexOf("id=");
        int lastIndex = html.lastIndexOf("\"");

        if(html.contains("<html>")){
            String subString = html.substring(index+4, lastIndex);
            System.out.println(subString);
        }
        else if (!html.contains("<html>")) {
            System.out.println("Invalid input!");
        }
    }
}