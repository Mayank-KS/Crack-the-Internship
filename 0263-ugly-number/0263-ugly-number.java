class Solution {
    public boolean /*Your Mom*/ isUgly(int n) {
        if (n <= 0) 
        {
            return false;
        }
        for (int factor : new int[] { 2, 3, 5 }) 
        {
            int dividend=n;
            int divisor=factor;
            while(n % factor == 0)
                n/=factor;
        }
        return n == 1;
    }
}