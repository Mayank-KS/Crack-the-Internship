class Solution {
    public String addBinary(String a, String b) {
        int m=a.length();
        int n=b.length();
        int carry=0,i=0,l;
        String ans="";
        if(m>n)
        {
            for(i=0;i<m-n;i++)
                b='0'+b;
            l=m;
        }
        else
        {
            for(i=0;i<n-m;i++)
                a='0'+a;
            l=n;
        }
            
        
        for(i=l-1;i>=0;i--)
        {
            char x=a.charAt(i);
            char y=b.charAt(i);
            if(x=='0' && y=='0' && carry==0)
                ans='0'+ans;
            else if(x=='1' && y=='0' && carry==0)
                ans='1'+ans;
            else if(x=='0' && y=='1' && carry==0)
                ans='1'+ans;
            else if(x=='1' && y=='0' && carry==1)
                ans='0'+ans;
            else if(x=='0' && y=='1' && carry==1)
                ans='0'+ans;
            else if(x=='1' && y=='1' && carry==0)
            {
                ans='0'+ans;
                carry++;
            }
            else if(x=='1' && y=='1' && carry==1)
                ans='1'+ans;
            else if(x=='0' && y=='0' && carry==1)
            {
                ans='1'+ans;
                carry--;
            }
        }
        if(carry==1)
            ans='1'+ans;
        return ans;
    }
}