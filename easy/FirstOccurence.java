package easy;

public class FirstOccurence {
    public static void main(String[] args) {
        System.out.println(strStr("krishna", "hna"));
    }

    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index == -1 ? -1 : index;
    }
}
