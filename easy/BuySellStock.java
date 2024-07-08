package easy;

public class BuySellStock {
    public static void main(String[] args) {
        int[] stock = { 2, 4, 1 };
        System.out.println(findMaxProfit(stock));
    }

    public static int findMaxProfit(int[] prices) {
        if (prices.length == 0 || prices == null)
            return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else {
                int profit = prices[i] - minPrice;
                if (profit > maxPrice)
                    maxPrice = profit;
            }
        }
        return maxPrice;
    }
}
