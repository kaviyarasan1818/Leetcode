class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
 
        for(int i=0;i<nums1.length;i++){
            boolean found=false;
            int org=nums1[i];
            nums1[i]=-1;
            for(int j=0;j<nums2.length;j++){
                if(org==nums2[j] ){    
                       found =true;

                }
                else if(found && nums2[j] > org){

                    nums1[i]=nums2[j];
                    break;
                }
                
            }
        }
        return nums1;
    }
}