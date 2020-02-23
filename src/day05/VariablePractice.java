package day05;

public class VariablePractice {
    public static void main(String[] args) {
// Task 1: Age calculator
        // given birth year , please calculate the age
        int birthYear = 2001;
        int currentYear = 2019;
        int age= currentYear-birthYear;

        // I was born in year 2001 , and I am 18 years old ;
    System.out.println("I was born in year "+ birthYear+ ", and I am " + age +" years old.");

    int speedLimit= 50;
    int currentSpeed= 55;
    int overTheLimit= currentSpeed - speedLimit;
    if (overTheLimit> 9){
        System.out.println("You are driving "+ overTheLimit + " more than speed limit");
    }
        else System.out.println("You are not speeding");



    }
}
