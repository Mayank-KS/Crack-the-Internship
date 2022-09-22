class Solution {
    public String reverseWords(String s) {
        int len=s.length();
        String ans="";
        String sub="";
        for(int i=0;i<len;i++)
            if(s.charAt(i)==' ')
            {
                ans+=sub+" ";
                sub="";
            }
            else
                sub=s.charAt(i)+sub;
        ans+=sub;
        return ans;
    }
}