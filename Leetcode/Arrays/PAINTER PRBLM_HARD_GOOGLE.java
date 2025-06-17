class Solution {
    public int splitArray(int[] nums, int m) {

     int min=nums[0],s=0,mid=0,ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            min=nums[i];
            s=s+nums[i];
        }
        while(min<=s)
        {
           mid=(min+s)/2;
           if(nstudents(nums,mid)<=m)
           {
            ans=mid;
            s=mid-1;
           }
           else
           min=mid+1;
      
        }
        return ans;

    }
    public int nstudents(int nums[], int mid)
    {
       int std=1,pages=0;
       for(int i=0;i<nums.length;i++)
       {
           if(pages+nums[i]<=mid)
           pages=pages+nums[i];
           else
           {
             std++;
             pages=nums[i];
           }

       }
       return std;







        
    }
}