class Solution {
    public int minMoves(int[] nums) {
        int l=nums.length;
        int i;
        int min=nums[0];
        int moves=0;
        for(i=1;i<l;i++)
            if(nums[i]<min)
                min=nums[i];
        
        for(i=0;i<l;i++)
            moves=moves+nums[i]-min;
        
        return moves;
    }
}