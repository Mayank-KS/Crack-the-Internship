class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int x=1,y=2;
        int z=0;
        int temp=n-2;
        while(temp!=0)
        {
            z=x+y;
            x=y;
            y=z;
            temp--;
        }
        return z;
    }
}