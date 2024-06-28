package easy;

public class MinimumComValue {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] numw2 = { 2, 4 };
        System.out.println(findMinValue(nums1, numw2));
    }

    public static int findMinValue(int[] nums1, int[] nums2) {
        int p1 = 0, p2 = 0;
        int minCommon = Integer.MAX_VALUE;

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                minCommon = Math.min(minCommon, nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return minCommon == Integer.MAX_VALUE ? -1 : minCommon;
    }
}
