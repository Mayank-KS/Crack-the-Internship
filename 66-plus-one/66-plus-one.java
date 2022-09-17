class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        for(int i=len-1;i>=0;i--)
            if(digits[i]==9)
            {
                if(i==0)
                {
                    int[] arr=new int[len+1];
                    arr[0]=0;
                    for(int j=1;j<=len;j++)
                        arr[j]=digits[j-1];
                    digits=arr;
                    i++;
                }
                digits[i]=0;
            }
            else 
            {
                digits[i]++;
                break;
            }
        
        return digits;
    }
}