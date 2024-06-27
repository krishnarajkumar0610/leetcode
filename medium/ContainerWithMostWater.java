package medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        findMaximumAmt(arr);
    }

    public static void findMaximumAmt(int[] height) {
        int st = 0, end = height.length - 1;
        int maximum = 0;
        while (st < end) {
            int currentArrea = Math.min(height[st], height[end]) * (end - st);
            if (currentArrea > maximum)
                maximum = currentArrea;
            if (height[st] < height[end])
                st++;
            else
                end--;
        }
        System.out.println(maximum);
    }
}
