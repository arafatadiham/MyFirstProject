package day17_Sunday;

public class ReversePrintString {

    public static void main(String[] args) {

        String name = "Alden";
        int x=name.length()-1;

        while(x>=0) {
            System.out.println("index " + x+" : "+ name.charAt(x));
            --x;

        }

    }
}
