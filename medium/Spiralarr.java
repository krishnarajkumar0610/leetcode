package medium;

public class Spiralarr {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 7, 8, 9 },
                { 7, 8, 9 },
        };
        spiralarr(arr);
    }

    public static void spiralarr(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1;

        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Print bottom row if there are remaining rows
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;

            // Print left column if there are remaining columns
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;

        }
    }
}
