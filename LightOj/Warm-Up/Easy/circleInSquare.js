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
        console.log(circleInSquare(parseFloat(userInput[i]),i))
    }
})
const circleInSquare = (r,caseNo) => {
    return `Case ${caseNo}: ${(((r*2)*(r*2)) - (Math.PI*r*r)).toFixed(2)}`
}
