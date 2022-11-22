class Solution {
    public boolean isHappy(int n) {
        int a=0;
        while(n!=1 && a<20)
        {
            a++;
            if(n/10==0 && (n*n)/10==0)
                return false;
            int temp=n;
            n=0;
            while(temp!=0)
            {
                int x=temp%10;
                n+=x*x;
                temp/=10;
            }
            
        }
        return a<20;
    }
}