class Solution {
    public int search(int[] nums, int target) {
        int i;
        int l=nums.length;
        for(i=0;i<l;i++)
            if(nums[i]==target)
                return i;
        
        return -1;
    }
}