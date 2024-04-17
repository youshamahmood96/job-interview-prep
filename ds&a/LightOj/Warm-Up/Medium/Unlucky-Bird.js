const readline = require('readline')
const rl = readline.createInterface({
    input:process.stdin
})
const userInput = []
rl.on('line',(values)=>{
    userInput.push(values)
})


rl.on('close',()=>{
    const noOfCases = parseInt(userInput[0])
    for(let i=1;i<=noOfCases;i++){
        const [v1,v2,v3,a1,a2] = userInput[i].split(" ")
        console.log(unLuckyBird(parseFloat(v1),parseFloat(v2),parseFloat(v3),parseFloat(a1),parseFloat(a2),i))
    }
})
const unLuckyBird = (v1,v2,v3,a1,a2,caseNo) => {
    let distanceBetweenTrains;
    let distanceCoveredByBird;
    distanceBetweenTrains = ((v1*v1)/(2*a1)) + ((v2*v2)/(2*a2))
    let t1 = v1/a1
    let t2 = v2/a2
    let t = Math.max(t1,t2)
    distanceCoveredByBird = v3*t
    return `Case ${caseNo}: ${distanceBetweenTrains} ${distanceCoveredByBird}`
}
