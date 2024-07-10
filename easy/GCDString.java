package easy;

public class GCDString {
    public static void main(String[] args) {

    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = findGcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
