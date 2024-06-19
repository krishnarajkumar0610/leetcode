package easy;

import java.util.*;

public class RomanNumbers {
    public static void main(String[] args) {
        // Test cases
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";
        romanToInt(s1);
        System.out.println("Input: " + s1 + " Output: " + romanToInt(s1)); // Output: 3
        System.out.println("Input: " + s2 + " Output: " + romanToInt(s2)); // Output: 58
        System.out.println("Input: " + s3 + " Output: " + romanToInt(s3)); // Output: 1994
    }

    public static int romanToInt(String s) {
        // Initialize the HashMap with Roman numeral values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int total = 0;
        int value = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            value = romanValues.get(s.charAt(i));
            if (value < prev) {
                total -= value;
            } else {
                total += value;
            }
            prev = value;
        }
        return total;
    }
}
