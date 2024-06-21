package easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello world";
        lengthOfLastWord(s);
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}