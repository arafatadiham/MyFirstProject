package day58_Wednesday;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(99999999);

        for (int i = 0; i > 0; i ++){
            System.out.println(i);
            nums.add(i);
        }

    }
}
