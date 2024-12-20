class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int p[]=new int[n];
        int s[]= new int [n];
        p[0]= nums[0];
        s[n-1] = nums[n - 1];
        int i=1,j=n-2;
        while(i<n-1){
            p[i] = p[i -1]*nums[i];
            s[j] = s[j +1]*nums[j];
            i++;
            j--;
        }
        int ans[]=new int [n];
        ans[0]=s[1];
        ans[n-1]=p[n-2];
        for( i=1;i<n-1;i++){
            int temp=p[i-1]*s[i+1];
            ans[i] = temp;
        }
        return ans;
    }
}