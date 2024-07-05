package medium;

import java.util.*;

public class LongestSubStringNoDup {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(findSubString(s));
    }

    public static int findSubString(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
            System.out.println("Current set:" + set);
        }
        return maxLength;
    }
}