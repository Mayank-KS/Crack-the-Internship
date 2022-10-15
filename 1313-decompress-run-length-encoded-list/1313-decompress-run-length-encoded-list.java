class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len=nums.length;
        ArrayList<Integer> a=new ArrayList<>();
        int x=0;
        for(int i=0;i<len;i+=2)
            for(int j=0;j<nums[i];j++)
            {
                a.add(nums[i+1]);
                x++;
            }
        int[] ans=new int[x];
        for(int i=0;i<x;i++)
            ans[i]=a.get(i);
        return ans;
    }
}