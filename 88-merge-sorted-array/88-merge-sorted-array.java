class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j=0;
        for(i=m;i<m+n;i++)
        {
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}