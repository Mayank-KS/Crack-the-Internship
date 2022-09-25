class Solution {
    public int[] runningSum(int[] nums) {
        int len=nums.length;
        int[] sum=new int[len];
        for(int i=0;i<len;i++)
            for(int j=0;j<=i;j++)
                sum[i]+=nums[j];
        return sum;
    }
}