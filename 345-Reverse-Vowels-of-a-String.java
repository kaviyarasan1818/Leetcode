class Solution {
    public String reverseVowels(String s) {
        String vow="aeiouAEIOU";
        StringBuffer sb=new StringBuffer();
        for(int i =0;i<s.length();i++){
            if(vow.contains(String.valueOf(s.charAt(i))))
            {
                sb.append(s.charAt(i));
            }
           
        }
        sb=sb.reverse();
        char ch[]=s.toCharArray();
        int j=0;
        for(int i =0;i<s.length();i++){
             if(vow.contains(String.valueOf(ch[i]))){
                ch[i]=sb.charAt(j);
                j++;
             }
             
             }
             return new String(ch);
    }
}  