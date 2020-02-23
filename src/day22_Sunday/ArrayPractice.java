package day22_Sunday;

public class ArrayPractice {
    public static void main(String[] args) {

        // create an byte array with size 4
// and store it into a variable called data
// assign value for each index location
// print out the values at each index
// update last index value
// then print it out

        byte [] data = new byte[4];

        data [0]= 10;
        data [1]= 15;
        data [2]= 25;
        data [3]= 55;

        // assign value for each index location

        // print out the values at each index

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        // update last index value
        System.out.println("Last index value after update: ");
        data[3] = 127;
        // then print it out
        System.out.println(data[3]);

    }
}
