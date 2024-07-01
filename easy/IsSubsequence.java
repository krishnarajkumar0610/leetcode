package easy;

import java.util.HashSet;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        isSubsequence(s, t);
    }

    public static boolean isSubsequence(String s, String t) {
        int ptr1 = 0, ptr2 = 0;
        while( ptr1 < s.length() && ptr2 < t.length())  {
            if(s.charAt(ptr1) == t.charAt(ptr2)){
                ptr1++;
            }
            ptr2++;
        }
        return ptr1 == s.length();
    }
}
