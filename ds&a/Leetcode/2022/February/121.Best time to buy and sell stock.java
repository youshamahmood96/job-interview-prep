class Solution {
    public static int maxProfit(int[] prices){
        int max = 0;
        int i = 0;
        int j = 1;
        while(j<prices.length){
            max = Math.max(max,prices[j]-prices[i]);
            if(prices[j]-prices[i]<0){
                i=j;
                j++;
            }
            else{
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}