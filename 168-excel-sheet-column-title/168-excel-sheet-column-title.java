class Solution {
    public String convertToTitle(int columnNumber) {
        String ans="";
        int temp=columnNumber;
        int ch;
        while(temp>0)
        {
            if (temp>26)
                ch=temp%26;
            else 
                ch=temp;
            
            if (ch==0)
            {
                ch=26;
                temp--;
            }
            ch=ch+64;
            char x=(char)ch;
            ans=x+ans;
            
            if(temp==26)
                temp=0;
            else
                temp=temp/26;
        }
        return ans;
    }
}