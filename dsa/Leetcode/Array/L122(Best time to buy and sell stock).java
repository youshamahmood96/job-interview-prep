public int maxProfit (int[] prices) {
    int max,i = 0;
    int j = 1;
    int curr;
    while(j<prices.length){
        if(prices[j]>prices[i]){
            curr = prices[j] - prices[i]
            max = Math.max(curr,max)
        }
        else{
            i = j
        }
        j++
    }
    return max
};
