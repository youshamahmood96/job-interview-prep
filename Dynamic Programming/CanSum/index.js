const canSum = (arr, sum,memo={}) => {
  if(sum in memo) return memo[sum]
  if(sum === 0) return true;
  if(sum < 0 || arr.length === 0) return false;

  for(num of arr) {
    if(canSum(arr, sum - num,memo)){
        memo[sum] = true
        return true
    };
  }
  memo[sum] = false
  return false;
}
console.log(canSum([2,3,4],5));