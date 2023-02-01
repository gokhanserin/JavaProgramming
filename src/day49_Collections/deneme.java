package day49_Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class deneme {

    public static void main(String[] args) {

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));

        System.out.println("nums[4] = " + nums[4]);


    }


}
