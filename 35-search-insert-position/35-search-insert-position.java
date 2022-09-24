class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int ll=0,ul=len-1;
        int mid;
        while(ll<=ul)
        {
            mid=(ul+ll)/2;
            if(nums[mid]==target)
            return mid;
            if(target>nums[mid])
                ll=mid+1;
            else
                ul=mid-1;
        }
        return ll;
    }
}