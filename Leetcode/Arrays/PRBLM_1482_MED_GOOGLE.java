class Solution {
    //int c=0,d=0,ans=0,mid=0;
    public int minDays(int[] bloomDay, int m, int k) {
         
         int min=bloomDay[0];
         int max=bloomDay[0];
         int ans=0,mid=0;
        for(int i=0;i< bloomDay.length;i++)
        {
            if(bloomDay[i]>max)
            max=bloomDay[i];
         if(bloomDay[i]<min)
            min=bloomDay[i];
        }
         
        if(k*m>bloomDay.length)
           return -1;
           
             while(min<=max)
        {
           
             mid=(min+max)/2;
             
           if(day(bloomDay,mid,k)==m)
           {
              ans=mid;
             
              max=mid-1;
             
           
           }
           else
           {
           min=mid+1;
           
           }
           
        } 
        return ans;  
    }
    public int day(int bloomDay[],int j,int k)
        {
            int d=0,c=0;
            for(int i=0;i<bloomDay.length;i++)
            {
            if(bloomDay[i]<=j)
            c++;
            else
            {
                d=d+(c/k);
                c=0;
            }
            
           
        }
        d=d+(c/k);
       
        return d;
        }

}