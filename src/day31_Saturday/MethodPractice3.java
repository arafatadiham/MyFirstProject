package day31_Saturday;

public class MethodPractice3 {

    public static void main(String[] args) {
        countDownFrom20tillOne();
        printOddNumbers1to100();
        spellingName();
    }

public static void countDownFrom20tillOne(){
    for (int i = 20; i >=0 ; i--) {
        System.out.print(i + " ");
    }
    System.out.println();
}

public static void printOddNumbers1to100(){

    for (int i = 1; i < 100; i+=2) {

        System.out.print(i + " ");
    }
    System.out.println();
}

public static void spellingName(){

        String name= "Alden";
    for (int i = 0; i < name.length(); i++) {
        System.out.print(name.charAt(i)+" ");
    }
}

}

