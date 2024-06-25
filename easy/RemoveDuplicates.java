package easy;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Since the first element is always unique
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
                    // 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k1 = removeDuplicates(nums1);
        System.out.println("k1 = " + k1); // Output should be 2
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int k2 = removeDuplicates(nums2);
        System.out.println("k2 = " + k2); // Output should be 5
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}

