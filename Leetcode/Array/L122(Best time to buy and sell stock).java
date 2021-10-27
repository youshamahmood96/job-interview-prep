class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int d = 0;
        while(j<prices.length){
            if(prices[i]>prices[j]){
                i++;
                j++;
            }
            else{
                d = d + (prices[j]-prices[i]);
                i++;
                j++;
            }
        }
        return d;
    }
}
