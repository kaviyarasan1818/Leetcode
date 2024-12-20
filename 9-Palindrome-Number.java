class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
           if(x==0){
            return true;
        }
        if(x<0 ||   x % 10 == 0){
            return false;
        }
     int rev = 0;
        while(0<x){
         
            int rem = x % 10;
            rev = ( rev *10 )+rem;
            x = x / 10;
            
        }
        
      return org == rev;
      
    }
}