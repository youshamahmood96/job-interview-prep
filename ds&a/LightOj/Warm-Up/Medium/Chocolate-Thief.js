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
    let inputPtr = 1
    for(let i=0;i<noOfCases;i++){
        let victim = ''
        let thief = ''
        let cases = parseInt(userInput[inputPtr])
        let tab = {}
        for(let i = inputPtr+1 ; i< cases+inputPtr+1;i++){
            let temp = userInput[i].split(" ")
            let vol = parseInt(temp[temp.length-1]) * parseInt(temp[temp.length-2]) * parseInt(temp[temp.length-3])
            let name = temp[0]
            if(tab[vol]){
                tab[vol].name = name
                tab[vol].freq++
            }
            else{
                tab[vol] = {
                    name,
                    freq:1
                }
            }
        }
        let keys = Object.keys(tab)
        if(keys.length===1){
            console.log(`Case ${i+1}: no thief`)
        }
        else{
            let smallest = parseInt(keys[0])
            let largest = parseInt(keys[1])
            victim = tab[keys[0]].name
            thief = tab[keys[1]].name
            for(let key in tab){
                if(tab[key].freq===1){
                    if(parseInt(key)<smallest){
                        smallest = parseInt(key)
                        victim = tab[key].name
                    }
                    else if(parseInt(key)>largest){
                        largest = parseInt(key)
                        thief = tab[key].name
                    }
                }
            }
            console.log(`Case ${i+1}: ${thief} took chocolate from ${victim}`)
        }
        inputPtr = inputPtr + cases + 1
    }
})
