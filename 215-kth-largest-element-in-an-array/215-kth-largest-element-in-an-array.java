class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int l=nums.length;
        return nums[l-k];
    }
}