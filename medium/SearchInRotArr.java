package medium;

public class SearchInRotArr {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1));
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int st = 0, end = nums.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[st] <= nums[mid]) {
                if (nums[st] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
