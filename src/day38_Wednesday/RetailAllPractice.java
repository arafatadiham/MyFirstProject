package day38_Wednesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetailAllPractice {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(50);
        nums1.add(100);
        nums1.add(200);
        nums1.add(500);
        nums1.add(700);
        nums1.add(800);

        System.out.println("nums1 = "+ nums1);
        // create a modifiable list:
        List<Integer > nums2 = new ArrayList<>(Arrays.asList(200,300,600,700,800));
        System.out.println("nums2 = " + nums2);
        // This will just keeping the common part of nums2
        nums1.retainAll (nums2);
        System.out.println("nums1 = " + nums1);

        nums2.retainAll (nums1);
        System.out.println("nums2 = " + nums2);


        //In order to check if 2 List objects has the same elements in the same order
        // we can use .equals to check
        // result will give you true or false

        System.out.println("Does nums1 has same elements as nums2 => " + nums1.equals(nums2));

        System.out.println("Does nums2 has same elements as nums1 => " + nums2.equals(nums1));

    }
}
