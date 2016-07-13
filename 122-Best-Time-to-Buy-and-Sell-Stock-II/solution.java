public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        if (prices.length==0) return 0;
        else {
            int valley = prices[0];
            int peak = prices[0];
            while (i<prices.length-1) {
                while (i<prices.length-1 && prices[i]>=prices[i+1]) {
                    i++;
                }
                valley = prices[i];
                if (i<prices.length-1 && prices[i]<prices[i+1]){
                    i++;
                }
                peak = prices[i];
                profit += peak - valley;
            }
            return profit;
        }
    }
}