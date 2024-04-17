const { performance } = require('perf_hooks');
const gridTravellerMemo = (m,n,memo={}) => {
    let key = `${m},${n}`
    if(memo[key]) return memo[key]
    if(m===1 && n===1) return 1;
    if(m===0 || n===0) return 0;
    return memo[key] =  gridTravellerMemo(m-1,n,memo)+gridTravellerMemo(m,n-1,memo);
}
let startMemo = performance.now();
console.log(gridTravellerMemo(18,18));
let endMemo = performance.now();
console.log(`Memoization took ${endMemo-startMemo} milliseconds`);
const gridTravellerTab = (m,n) => {
    let key = `${m-1},${n-1}`
    let tab = {}
    for(let i=0; i<n; i++){
        for(let j=0; j<m; j++){
            let keyN = `${j},${i}`
            if(j===0 || i===0) tab[keyN] = 1;
            else tab[keyN] = tab[`${j-1},${i}`]+tab[`${j},${i-1}`];
        }
    }
    return tab[key] 
}
let startMemoTab = performance.now();
console.log(gridTravellerTab(18,18));
let endMemoTab= performance.now();
console.log(`Tabulization took ${endMemoTab-startMemoTab} milliseconds`);