package coding.leetcode.blind75.sliding.stocksell;

public class StockSell {
    public int maxProfit(int[] prices) {

        int left = prices[0];
        int max_profit = 0;

        for(int right: prices){
            if(left>right)
                left = right;

            max_profit = Math.max(max_profit, right-left);
        }

        return max_profit;
    }
}
