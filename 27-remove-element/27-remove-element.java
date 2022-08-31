class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length;
        int ci=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]!=val)
            {
                nums[ci]=nums[i];
                ci++;
            }
        }
        return ci;
    }
}