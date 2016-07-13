public class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        int i = 0;
        int profit = 0;
        if (prices.length==0) return 0;
        else {
            int valley = prices[0];
            int peak = prices[0];
            while (i<prices.length-1) {
                while (i<prices.length-1 && prices[i]>=prices[i+1]) {
                    i++;
                }
                if (prices[i]<valley) {
                    valley = prices[i];
                    peak = valley;
                }
                System.out.println("Valley: " + valley);
                while (i<prices.length-1 && prices[i]<prices[i+1]) {
                    i++;
                }
                peak = (prices[i]>peak)?prices[i]:peak;
                System.out.println("Peak: " + peak);

                profit = peak- valley;
                System.out.println("Profit: " + profit);
                System.out.println("-----------------------");

                mp = (profit>mp)?profit:mp;
                
            }
            return mp;
        }
    }
}