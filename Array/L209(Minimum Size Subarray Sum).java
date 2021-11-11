/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(target, nums) {
   let i=0,j=0
   let min = Infinity
   let sum = 0;
   while(j<nums.length){
       sum+=nums[j]
       if(sum<target){
           j++
       }
       else{
           while(i<=j){
               if(sum-nums[i]>=target){
                   sum-=nums[i]
                   i++
               }
               else{
                   break
               }
           }
            min = Math.min(min,j-i+1)
            j++
       }
   }
    return (min == Infinity) ? 0 : min;
};
