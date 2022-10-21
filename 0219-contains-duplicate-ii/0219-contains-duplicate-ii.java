class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len=nums.length;
        for(int i=0;i<len-1;i++)
            for(int j=i+1;j<len && j-i<=k;j++)
                if(nums[i]==nums[j])
                    return true;
        return false;
    }
}