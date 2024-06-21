package easy;

class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3; // You can change this to test other values of n
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        // Base cases
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
