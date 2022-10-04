class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int ans=0;
            for(int i=0;i<len;i++)
                ans+=(i+1-nums[i]);
        return ans;
    }
}