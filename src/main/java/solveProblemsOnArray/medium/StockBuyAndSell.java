package solveProblemsOnArray.medium;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] input = new int[]{7, 1, 5, 4, 3, 6};
        System.out.println(bestTimeToBuyAndSellStock(input));
    }

    public static int bestTimeToBuyAndSellStock(int[] prices) {
        // Write your code here.
        int ans = 0;
        int buy = prices[0];
        int sell;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
                continue;
            }
            sell = prices[i] - buy;
            ans = Math.max(sell, ans);
        }
        return ans;
    }
}
