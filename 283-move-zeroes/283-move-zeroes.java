class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int i,j,k=l;
        for(i=0;i<k;)
        {
            if(nums[i]==0)
            {
                for(j=i;j<k-1;j++)
                {
                    int temp;
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                k--;
            }
                
            else
                i++;
        }
    }
}