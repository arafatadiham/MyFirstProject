package day22_Sunday;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//Create an String array with size that you define;
        //and store all your household member names

        String[] loveOnes = new String[5];

        loveOnes[0] = "Adila";
        loveOnes[1] = "Aydin";
        loveOnes[2] = "Aychin";

        System.out.println(loveOnes[0]);
        System.out.println(loveOnes[1]);
        System.out.println(loveOnes[2]);

        // immutable means you can not change the internal structure of the object
// if you have String abc = "Hello"
// if you do abc.toUppercase -->> it will create new String object "HELLO"
// and it does not change original hello at all !!
// not resizable --> specifically for array
// we can not change the size of array once we create them with certain size
// However , we can change the elements inside this array
// and it means : IT IS NOT IMMUTABLE
    }
}
