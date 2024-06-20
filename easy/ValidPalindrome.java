package easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        boolean status = true;
        int st = 0, end = s.length() - 1;
        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                status = false;
                break;
            }
            st++;
            end--;
        }
        return status;
    }
}
