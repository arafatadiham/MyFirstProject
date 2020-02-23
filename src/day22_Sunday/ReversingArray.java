package day22_Sunday;

public class ReversingArray {
    public static void main(String[] args) {


        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        // how do we get the size of any array object
        // array object has a property called length
        int itemCount = scores.length;
        int lastItemIndex = itemCount - 1;


        for (int x = lastItemIndex; x >= 0; x--) {

            System.out.println("Index Location " + x);

            System.out.println(scores[x]);

        }

    }
}
