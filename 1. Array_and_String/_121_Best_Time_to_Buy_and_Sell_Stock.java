public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int sell = prices[0];
        int profit = 0;

        for (int i = 1; i<prices.length; i++){
            if(sell > prices[i]){
                sell = prices[i];
            }

            profit = Math.max(profit, prices[i]-sell);
        }

        return profit;
    }
}
