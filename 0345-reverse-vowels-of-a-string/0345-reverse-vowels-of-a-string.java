class Solution {
    public String reverseVowels(String s) {
        int len=s.length()-1;
        int a=0;
        String x="",y="";
        while(a<=len)
        {
            if(isVowel(s.charAt(a)) && isVowel(s.charAt(len)) && a!=len)
            {
                x+=s.charAt(len);
                y=s.charAt(a)+y;
                a++;
                len--;
            }
            else if(isVowel(s.charAt(a))==false)
            {
                x+=s.charAt(a);
                a++;
            }
            else
            {
                y=s.charAt(len)+y;
                len--;
            }
        }
        return x+y;
    }
    public boolean isVowel(char n)
    {
        String N=""+n;
        N=N.toUpperCase();
        if(N.equals("A") || N.equals("E") || N.equals("I") || N.equals("O") || N.equals("U"))
            return true;
        else
            return false;
    }
}