package medium;

import java.util.*;

public class Spiralarr {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
        };
        List<Integer> matrix = spiralarr(arr);
        System.out.println(matrix);
    }

    public static List<Integer> spiralarr(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int length = matrix.length;

        for (int[] m : matrix) {
            if (m.length != length) {
                return new ArrayList<>();
            }
        }

        int rowStart = 0, rowEnd = matrix.length;
        int colStart = 0, colEnd = matrix[0].length;

        while (rowStart < rowEnd && colStart < colEnd) {
            for (int i = colStart; i < colEnd; i++)
                result.add(matrix[rowStart][i]);
            rowStart++;
            for (int i = rowStart; i < rowEnd; i++)
                result.add(matrix[i][colEnd - 1]);
            colEnd--;
            for (int i = colEnd - 1; i >= colStart; i--)
                result.add(matrix[rowEnd - 1][i]);
            rowEnd--;
            for (int i = rowEnd - 1; i >= rowStart; i--)
                result.add(matrix[i][colStart]);
            colStart++;
        }
        return result;
    }
}
