const gridTravellerMemo = (m,n,memo={}) => {
    let key = `${m},${n}`
    if(memo[key]) return memo[key]
    if(m===1 && n===1) return 1;
    if(m===0 || n===0) return 0;
    return memo[key] =  gridTravellerMemo(m-1,n,memo)+gridTravellerMemo(m,n-1,memo);
}
console.log(gridTravellerMemo(18,18));
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
console.log(gridTravellerTab(18,18));