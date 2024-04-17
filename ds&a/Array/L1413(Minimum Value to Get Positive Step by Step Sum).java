static int minStartValue(int[] nums) {
   int minValue = 0;
   int prefixSum = 0;
   for(int i=0;i<nums.length;i++){
       prefixSum+=nums[i];
       minValue = Math.min(minValue,prefixSum);
   }
    return 1-minValue;
};
