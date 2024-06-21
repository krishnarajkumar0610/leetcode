package easy;

import java.util.*;

public class ClimbingStairs {

    public int climbStairs(int n) {
        // Create a HashMap to store the results of subproblems
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairsMemo(n, memo);
    }

    private int climbStairsMemo(int n, Map<Integer, Integer> memo) {
        // Base cases
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = climbStairsMemo(n - 1, memo) + climbStairsMemo(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        ClimbingStairs solution = new ClimbingStairs();
        int n = 3; // You can change this to test other values of n
        System.out.println(solution.climbStairs(n));
    }
}
