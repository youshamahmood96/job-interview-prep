const { performance } = require('perf_hooks');
var climbStairsMemo = function(n,memo=[]) {
    if(memo[n]) return memo[n];
    if(n===0 || n===1) return 1
    return memo[n] = climbStairsMemo(n-1,memo)+climbStairsMemo(n-2,memo)
};
const startMemo = performance.now();
console.log(climbStairsMemo(44));
const endMemo = performance.now();
console.log(`Memoization took ${endMemo - startMemo} Milliseconds`);
var climbStairsTab = function(n) {
    var tab = [1,1];
    for(var i=2;i<=n;i++){
        tab[i] = tab[i-1]+tab[i-2];
    }
    return tab[n];
}
const startTab = performance.now();
console.log(climbStairsTab(44));
const endTab = performance.now();
console.log(`Tabulation took ${endTab - startTab} Milliseconds`);
