class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int l=nums.length;
        List<Integer> lis=new ArrayList<Integer>();
        int i;
        Arrays.sort(nums);
        for(i=0;i<l-1;i++)
            if(nums[i]==nums[i+1])
            {
                lis.add(nums[i]);
                i++;
            }
        
        return lis;
    }
}