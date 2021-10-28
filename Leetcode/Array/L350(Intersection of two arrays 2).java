class Solution {
    public int[] compare(int[] nums1, int[] nums2){
        if(nums1.length<nums2.length){
            return nums1;
        }
         else if(nums1.length == nums2.length){
            return nums1;
        }
        else{
            return nums2;
        }
    }
    public int[] compare2(int[] nums1, int[] nums2){
        if(nums1.length>nums2.length){
            return nums1;
        }
        else if(nums1.length == nums2.length){
            return nums2;
        }
        else{
            return nums2;
        }
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap();
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<compare(nums1,nums2).length;i++){
           if(map.containsKey(compare(nums1,nums2)[i])){
               int temp = map.get(compare(nums1,nums2)[i]);
               temp++;
               map.replace(compare(nums1,nums2)[i],temp);
           }
           else{
                map.put(compare(nums1,nums2)[i],1);
              }
        }
        for(int i=0;i<compare2(nums1,nums2).length;i++){
            if(map.containsKey(compare2(nums1,nums2)[i])){
                int temp = map.get(compare2(nums1,nums2)[i]);
                temp--;
                if(temp==0){
                    result.add((compare2(nums1,nums2)[i]));
                    map.remove(compare2(nums1,nums2)[i]);
                }
                else if(temp>0){
                    result.add((compare2(nums1,nums2)[i]));
                    map.replace(compare2(nums1,nums2)[i],temp);
                }
            }
        }
        int[] array = new int[result.size()];
        for(int i = 0; i < result.size(); i++) array[i] = result.get(i);
        return array;
    }
}
