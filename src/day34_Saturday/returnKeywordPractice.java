package day34_Saturday;

public class returnKeywordPractice {
    public static void main(String[] args) {
//        System.out.println(calculateAndReturnAge(1999));
        int []arr = {1985,2000,2019, 1987, 1978,1964,3965, 2004};
        for (int i = 0; i < arr.length; i++) {
            int num =calculateAndReturnAge(arr[i]);
            System.out.println("age " + num);
        }
        System.out.println("_________________________");
        for (int eachArry:  arr ) {
            System.out.println(calculateAndReturnAge(eachArry));
        }
//        calculateAndReturnAge
//        Write a method accept a birth year and return the age :
//        the birth year should be within the range of 1900-2020
//        if not return 0
//        optionally : test your code against array of birthYears
//        {1999,122,2019, 1987, 1978,1964,3999, 2004}
    }
    public static int calculateAndReturnAge (int birthYear){
        // I want to take out negative scenario first and just return 0
        if (birthYear <= 1900 || birthYear >= 2020) {
            return 0;
        }
        // If I reach this point , it means the birth year is valid
        return 2019 - birthYear;
    }
}