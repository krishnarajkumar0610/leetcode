package easy;

import java.util.HashMap;

class GoodPair {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };
        findPair(arr);
    }

    public static void findPair(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int pairCount = 0;

        for (int num : arr) {
            if (countMap.containsKey(num)) {
                pairCount += countMap.get(num);
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        System.out.println(pairCount);
    }
}
