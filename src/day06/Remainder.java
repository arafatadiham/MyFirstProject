package day06;

public class Remainder {
    public static void main(String[] args) {
        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        //5 divided by 2 is 2 i Java, remainder is 1


        //2*2+1=5
        System.out.println(5%2);
        //10*9+9=99
        System.out.println(99%10);

        int minutes=135;
        System.out.println(minutes/60+" hours"+ minutes%60+ "minutes");


    }
}
