package easy;
// Example 1:

import java.util.Arrays;

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
// Example 2:

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].
// Example 3:

// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
public class MergeSortedArr {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        MergeSortedArr m = new MergeSortedArr();
        m.merge(nums1, nums2, 3, 3);
    }

    public void merge(int[] nums1, int[] nums2, int m, int n) {
        if (m == 0) {
            // nums1 is empty, directly copy nums2 into nums1
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            System.out.println(Arrays.toString(nums1));
            return;
        } else if (n == 0) {
            // nums2 is empty, nums1 remains the same
            System.out.println(Arrays.toString(nums1));
            return;
        } else {
            int index = m;
            for (int value : nums2) {
                nums1[index++] = value;
            }
        }
        sortIt(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void sortIt(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
}
