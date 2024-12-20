class Solution {
    public int maxSubArray(int[] nums) {
       int cur= nums[0];
       int fcur=nums[0];
     
        for(int i=1;i<nums.length;i++){
          cur = Math.max(cur + nums[i],nums[i]);
          fcur = Math.max(cur,fcur);
        }
     return fcur;
      
    }
}