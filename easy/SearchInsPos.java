package easy;

public class SearchInsPos {
    public static void main(String[] args) {
        int[] arr = { 1,3,5,6 };

        System.out.println(findInsPos(arr, 2));
    }

    public static int findInsPos(int[] arr, int target) {
        int st = 0, end = arr.length - 1;
        int mid = 0;
        while (st <= end) {
            mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("St:"+st);
        System.out.println("End:"+end);
        return st;
    }
}
