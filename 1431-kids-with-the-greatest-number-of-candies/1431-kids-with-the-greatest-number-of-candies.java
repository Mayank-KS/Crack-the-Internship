class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max=-1;
        int len=candies.length;
        for(int i=0;i<len;i++)
            if(max<candies[i])
                max=candies[i];
        
        for(int i=0;i<len;i++)
            if(candies[i]+extraCandies>=max)
                ans.add(true);
            else ans.add(false);
        
        return ans;
    }
}