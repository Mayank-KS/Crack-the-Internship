class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        int l=nums.length;
        for(i=0;i<l-1;i++)
        {
                for(j=i+1;j<l;j++)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        ans[0]=i;
                        ans[1]=j;
                        return ans;
                    }

                }
        }
        return ans;
    }
}