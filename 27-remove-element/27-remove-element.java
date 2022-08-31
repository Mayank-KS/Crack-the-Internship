class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length;
        for(int i=0 ; i<l ;)
        {
            if(nums[i]==val)
            {
                for(int j = i; j < l-1 ;j++)
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                l--;
            }
            else
                i++;
        }
        return l;
    }
}