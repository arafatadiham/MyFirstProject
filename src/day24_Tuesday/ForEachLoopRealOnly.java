package day24_Tuesday;

public class ForEachLoopRealOnly {
    public static void main(String[] args) {

        int yourFavnumber= 300;
        int myFavNumber= yourFavnumber;

        myFavNumber = 299;
        System.out.println(yourFavnumber); // in General life , yourFavNumber won't change , still 300 ;



        long [] nums = {10,40,20};
        // how do I change double my first item kin the array
       // nums[0] = nums[0] * 2; // nums[0] *=2;
      //  System.out.println(nums[0]);

        for (long eachItem : nums) {
            // System.out.println( nums [x] * 2); just printing , will not change ethe value
            eachItem = 100 ;
        }
        // Interview answer :  Do not use for each loop to modify Array
        // how do I know array items are modified kor not re-print

        System.out.println("After we modify the value");
        for (int x=0; x<3; x++){
            System.out.println(nums[x]);
        }

    }

}
