package easy;

public class MergeStrAlt {
    public static void main(String[] args) {
        System.out.println(merge("abcd", "pq"));
    }

    public static String merge(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int pt1 = 0, pt2 = 0;
        while (pt1 < word1.length() && pt2 < word2.length()) {
            sb.append(word1.charAt(pt1++));
            sb.append(word2.charAt(pt2++));
        }
        while (pt1 < word1.length()) {
            sb.append(word1.charAt(pt1++));
        }
        while (pt2 < word2.length()) {
            sb.append(word2.charAt(pt2++));
        }
        return new String(sb);
    }
}
