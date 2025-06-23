class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int a=0,b=0,max=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]>max)
                {
                max=mat[i][j];
                a=i;
                b=j;
                }


            }


        }
        int d[]={a,b};
        return(d);

        
    }
}