public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0; //window
        int buy = 0; //left

        for (int sell = 1 /*right */; sell < n; sell++) {
            if (prices[sell] < prices[buy]) {
                prices[buy] = prices[sell];
            }
            profit = Math.max(profit, prices[sell] - prices[buy]);
        }

        return profit;

    }

    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        System.out.println(maxProfit(prices));
    }
}
