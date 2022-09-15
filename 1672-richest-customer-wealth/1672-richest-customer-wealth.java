class Solution {
    public int maximumWealth(int[][] accounts) {
        int row=accounts.length;
        int col=accounts[0].length;
        int[] arr=new int[row];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr[i]+=accounts[i][j];
        
        int max=-1;
        for(int i=0;i<row;i++)
            if(arr[i]>max) max=arr[i];
        
        return max;
    }
}