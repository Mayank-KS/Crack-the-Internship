class Solution {
    public int maximumProduct(int[] nums) {
        int l=nums.length;
        int i,j,k,max=nums[0]*nums[1]*nums[l-1];
        Arrays.sort(nums);
        for(i=0;i<l-2;i++)
            for(j=i+1;j<l-1;j++)
                if(max<nums[i]*nums[j]*nums[l-1])
                    max=nums[i]*nums[j]*nums[l-1];
        
        return max;
    }
}