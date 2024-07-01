package easy;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(findMissing(nums));
    }

    public static int findMissing(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i])
                return i;
        }
        return nums.length;
    }
}
