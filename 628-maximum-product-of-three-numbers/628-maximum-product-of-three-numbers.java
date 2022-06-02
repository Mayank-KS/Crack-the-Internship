class Solution {
    public int maximumProduct(int[] nums) {
        int l=nums.length;
        int i,j,k;
        Arrays.sort(nums);
        int max=nums[0]*nums[1]*nums[l-1];
        if(nums[l-1]*nums[l-2]*nums[l-3]>max)
            max=nums[l-1]*nums[l-2]*nums[l-3];
        
        return max;
    }
}