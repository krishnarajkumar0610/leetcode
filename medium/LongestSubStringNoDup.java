package medium;

import java.util.*;

public class LongestSubStringNoDup {
    public static void main(String[] args) {
        String s = "abcabcbb";
        findSubString(s);
    }

    public static int findSubString(String s) {
        int n = s.length();
        int maxLength = 0;
        int delete = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(delete));
                delete++;
            }
            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - delete + 1);
        }
        return maxLength;
    }

}
