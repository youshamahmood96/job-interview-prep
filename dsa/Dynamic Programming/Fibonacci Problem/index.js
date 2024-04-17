const { performance } = require('perf_hooks');
// Memoization
const fib = (n,memo=[]) => {
    if(memo[n]) return memo[n];
    if(n<=2) return 1;
    return memo[n] = fib(n-1,memo) + fib(n-2,memo);
}
let startMemo = performance.now();
console.log(fib(100));
let endMemo = performance.now();
console.log(`Memoization took ${endMemo-startMemo} milliseconds`);
// Tabulation
const fibTab = (n) => {
    if(n<=2) return 1;
    let tab = [0,1,1]
    for(let i=3;i<=n;i++){
        tab[i] = tab[i-1] + tab[i-2];
    }
    return tab[n];
}
let startMemoTab = performance.now();
console.log(fibTab(100));
let endMemoTab= performance.now();
console.log(`Tabulization took ${endMemoTab-startMemoTab} milliseconds`);