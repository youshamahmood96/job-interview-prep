/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let max = 0
    let i = 0
    let j = 1
    let curr
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
