class Solution {
    int th;
    public int minEatingSpeed(int[] piles, int h) {
     int max=piles[0];
     int ans=0;
     for(int i=0;i<piles.length;i++)
     {
        if(piles[i]>max)
        max=piles[i];
     }
         int s=1;
         int e=max;
         while(s<=e)
         {
             int mid=(s+e)/2;
             th=tothr(piles,mid);
             if(th<=h)
             {
                ans=mid;
                e=mid-1;
             }
             else
             s=mid+1;



         }
         return ans;

    }
      
     public int tothr(int piles[],int m)
     { 
            th=0;
           for(int i=0;i<piles.length;i++)
           {
            if(piles[i]%m==0)
            th=th+piles[i]/m;
            else
            th=th+((piles[i]/m)+1);
           }
           //System.out.println(th);
           return th;

     }


}