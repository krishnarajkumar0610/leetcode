package easy;

//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true

import java.util.*;

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = true;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return isDuplicate;
            }
        }
        return !isDuplicate;
    }
}
