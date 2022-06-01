class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=cardPoints.length;
        int i,x=0,total=0;
        for(i=0;i<l;i++)
        {
            total=total+cardPoints[i];
            if(i<l-k)
                x=total;
        }
        int max=total-x;
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