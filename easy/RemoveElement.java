package easy;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        System.out.println(remove(nums, 0));
    }

    public static int remove(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
