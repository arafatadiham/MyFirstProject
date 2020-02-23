package repl_it_Assignments;

import java.util.Scanner;

public class P090_TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String splitOrNo = scan.nextLine();
        System.out.println("Number of people:");
        int numberOfPpl = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        String quality = scan.next();
        String numberofGuest = "";
        double totalTip;
        double taotalPerpeson;
        if (splitOrNo.equalsIgnoreCase("Yes")) {
            for (int i = 0; i < numberOfPpl; i++) {
                numberofGuest += "&";
            }
        }
        System.out.println("Number of people entered:" + numberofGuest);
        if (quality.equalsIgnoreCase("Excellent")) {
            totalTip = (checkAmount * 25) / 100;
            System.out.println("Total to pay: "+ (checkAmount+totalTip));
            System.out.println("Total per person: "+totalTip/numberOfPpl);
        }else if (quality.equalsIgnoreCase("Great")){
            totalTip = (checkAmount*20)/100;
            System.out.println("Total to pay:"+(checkAmount+totalTip));
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person: " +(checkAmount+totalTip)/numberOfPpl);
            System.out.println("Tip per person: "+totalTip/numberOfPpl);
        }else if ( quality.equalsIgnoreCase("Good") ){
            totalTip = (checkAmount*15)/100;
            System.out.println("Total to pay:"+(checkAmount+totalTip));
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person: " +(checkAmount+totalTip)/numberOfPpl);
            System.out.println("Tip per person: "+totalTip/numberOfPpl);
        }else if (  quality.equalsIgnoreCase("Fair")){
            totalTip = (checkAmount*10)/100;
            System.out.println("Total to pay:"+(checkAmount+totalTip));
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person: " +(checkAmount+totalTip)/numberOfPpl);
            System.out.println("Tip per person: "+totalTip/numberOfPpl);
        }else if (quality.equalsIgnoreCase("Poor")){
            totalTip = (checkAmount*5)/100;
            System.out.println("Total to pay:"+(checkAmount+totalTip));
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person: " +(checkAmount+totalTip)/numberOfPpl);
            System.out.println("Tip per person: "+totalTip/numberOfPpl);
        }

    }
}
