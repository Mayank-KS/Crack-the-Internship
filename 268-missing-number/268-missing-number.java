class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int ans=len;
            for(int i=0;i<len;i++)
                ans+=(i-nums[i]);
        return ans;
    }
}