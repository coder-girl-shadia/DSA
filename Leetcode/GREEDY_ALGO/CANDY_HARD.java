class Solution {
    public int candy(int[] ratings) {
       
       int sum=1,i=1,n=ratings.length;
       while(i<ratings.length)
       {
         if(ratings[i]==ratings[i-1])
         {
            sum=sum+1;
            i++;
            continue;
         }
         int peak=1;
         while(i<n && ratings[i]>ratings[i-1])
         {
            peak=peak+1;
            sum=sum+peak;
            i++;
         }
         int down=1;
         while(i<n && ratings[i]<ratings[i-1])
         {
        
            sum=sum+down;
             down=down+1;
            i++;
         }
         if(down>peak)
         sum=sum+(down-peak);

       }
       return sum;
    }
}