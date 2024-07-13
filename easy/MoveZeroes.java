package easy;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        m.moveZeroes(new int[] { 0, 1, 0, 3, 12 });
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                moveToEnd(nums, i);
            }
        }
    }

    public static void moveToEnd(int[] arr, int index) {
        int val = arr[index];
        for (int i = index + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = val;
    }
}
