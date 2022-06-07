class Solution {
    public int findPeakElement(int[] nums) {
        int l=nums.length;
        int i;
        if(l==1)
            return 0;
        for(i=1;i<l-1;i++)
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
                return i;
        
        if(nums[l-1]>nums[l-2])
            return l-1;
        else if(nums[0]>nums[1])
            return 0;
        return -1;
    }
}