class Solution {
    public void setZeroes(int[][] matrix) {
        int i,j,k=0,l=0;
        int m=matrix.length;
        int n=matrix[0].length;
        for(i=0;i<m;i++)
        {
            if(matrix[i][0]==0)
                k++;
            
            for(j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(i==0)
                        l++;
                    
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }
        if(k!=0)
            for(i=0;i<m;i++)
                matrix[i][0]=0;
        if(l!=0)
            for(i=0;i<n;i++)
                matrix[0][i]=0;
    }
}