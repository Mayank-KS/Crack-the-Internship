class Solution {
    public void sortColors(int[] nums) {
        int i,a=0,b=0;
        int l=nums.length;
        for(i=0;i<l;i++)
        {
            if(nums[i]==0)
            {
                a++;
            }
            else if(nums[i]==1)
            {
                b++;
            }
        }
        for(i=0;i<l;i++)
        {
            if(i>=0 && i<a)
                nums[i]=0;
            else if(i>=a && i<a+b)
                nums[i]=1;
            else
                nums[i]=2;
        }
    }
}