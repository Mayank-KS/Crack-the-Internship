class Solution {
    public int removeElement(int[] nums, int val) {
        int ci=0;
        for(int i:nums)
        {
            if(i!=val)
            {
                nums[ci]=i;
                ci++;
            }
        }
        return ci;
    }
}