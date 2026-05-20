class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length < 2) return 0;

        int i = 0;
        int j = 0;
        int k = 1;

        int maxProfit = 0;

        while (k < prices.length) {
            if (prices[k] > prices[j]) {
                j = k;
            } else if (prices[k] < prices[i]) {
                i = k;
                j = k;
            }

            maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            k++;
        }

        return maxProfit;
        
    }
}
