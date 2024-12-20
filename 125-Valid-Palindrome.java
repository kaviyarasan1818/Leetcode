class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        s=s.toLowerCase();
        
          for(int i=0;i<s.length();i++)
          if(s.charAt(i) >= 'a' && s.charAt(i)<= 'z' || s.charAt(i) >= '0' && s.charAt(i)<= '9'){
          sb.append(s.charAt(i));
          }
     
return sb.toString().equals(sb.reverse().toString());
    }
}