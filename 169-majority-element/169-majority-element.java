class Solution {
    public int majorityElement(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(nums[i]>nums[j])
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums[l/2];
    }
}