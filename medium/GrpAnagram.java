package medium;

import java.util.*;

public class GrpAnagram {
    public static void main(String[] args) {
        System.out.println(grpANagram(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> grpANagram(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> set = new HashMap<>();
        for (String word : strs) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String s = new String(letters);
            if (!set.containsKey(s)) {
                set.put(s, new ArrayList<>());
            }
            set.get(s).add(word);
        }
        return new ArrayList<>(set.values());
    }
}
