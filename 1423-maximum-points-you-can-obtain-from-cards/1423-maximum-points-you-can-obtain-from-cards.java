class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=cardPoints.length;
        int i,max=0;
        for(i=l-k;i<l;i++)
            max=max+cardPoints[i];
        int temp=max;
        for(i=0;i<k;i++)
        {
            temp=temp+cardPoints[i]-cardPoints[l-k+i];
            if(temp>max)
                max=temp;
        }
        return max;
    }
}