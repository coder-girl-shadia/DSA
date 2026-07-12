class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        Arrays.sort(Jobs,(a,b)->(Integer.compare(b[2],a[2])));
        int res[]=new int[2];
        int cp=0,c=0,maxded=0;
       
        for(int i=0;i<Jobs.length;i++)
        {
            maxded=Math.max(maxded,Jobs[i][1]);

        }
         int hash[]=new int[maxded+1];
         Arrays.fill(hash,-1);
        for(int i=0;i<Jobs.length;i++)
        {
               for(int j=Jobs[i][1];j>0;j--)
               {
                 if(hash[j]==-1)
                 {
                    hash[j]=Jobs[i][0];
                    c++;
                    cp=cp+Jobs[i][2];
                    break;
                 }

               }
        }
        res[0]=c;
        res[1]=cp;
        return res;
    }
}