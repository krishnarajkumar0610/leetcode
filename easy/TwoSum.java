package easy;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        int i = 0;
        int[] indexes = {0, 0};
        for (i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    indexes[index++] = i;
                    indexes[index] = j;
                }
            }
        }
        return indexes;
    }
}