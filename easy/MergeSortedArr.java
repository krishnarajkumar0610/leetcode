package easy;
import java.util.Arrays;

public class MergeSortedArr {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        MergeSortedArr m = new MergeSortedArr();
        m.merge(nums1, nums2, 3, 3);
    }

    public void merge(int[] nums1, int[] nums2, int m, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            System.out.println(Arrays.toString(nums1));
            return;
        } else if (n == 0) {
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
