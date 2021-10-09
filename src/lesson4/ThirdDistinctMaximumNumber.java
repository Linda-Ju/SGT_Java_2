package lesson4;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ThirdDistinctMaximumNumber {
    public static void main(String[] args) {
//      1 solution
        int[] nums = {2, 2, 3, 1};
        Arrays.sort(nums);
        Set<Integer> numSet = new TreeSet<>();
        for (Integer num : nums) {
            numSet.add(num);
        }
        Integer arr[] = new Integer[numSet.size()];
        arr = numSet.toArray(arr);
        int max = arr[0];
        int i;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        if (arr.length < 3) {
            System.out.println(max);
        } else if (arr.length >= 3) {
            int thirdMax = nums[arr.length - 3];
            System.out.println(thirdMax);


//      2nd solution
//        int[] numsArray = {-7, 78, 150, 0, 207, -84};
//        Set<Integer> numsSet = new TreeSet<>();
//        for (Integer num : numsArray) {
//            numsSet.add(num);
//        }
//        int n = numsSet.size();
//        Integer arr[] = new Integer[n];
//        arr = numsSet.toArray(arr);
//        if (arr.length >= 3) {
//            System.out.println(arr[arr.length - 3]);
//        } else {
//            System.out.println(arr[arr.length - 1]);
//        }
        }
    }
}


