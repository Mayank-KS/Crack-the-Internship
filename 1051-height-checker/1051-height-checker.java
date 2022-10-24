class Solution {
    public int heightChecker(int[] heights) {
        int len=heights.length;
        int[] temp=new int[len];
        for(int i=0;i<len;i++)
            temp[i]=heights[i];
        Arrays.sort(heights);
        int ans=0;
        for(int i=0;i<len;i++)
            if(heights[i]!=temp[i])
                ans++;
        return ans;
    }
}