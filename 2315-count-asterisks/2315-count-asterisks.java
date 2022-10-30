class Solution {
    public int countAsterisks(String s) {
        int l=s.length();
        int count=0;
        int i,x=0;
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)=='|')
                x++;
            if(s.charAt(i)=='*' && x%2==0)
                count++;
        }
        return count;
    }
}