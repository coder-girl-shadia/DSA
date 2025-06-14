class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

         int min=nums[0],max=nums[0],ans=0,mid=0;
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]>max)
            max=nums[i];
            if(nums[i]<min)
            min=nums[i];

         }
         
         while(min<=max)
         {
            mid=(min+max)/2;
            
            if(div(nums,mid)<=threshold)
            {
                ans=mid;
                max=mid-1;
            }
            else
            min=mid+1;
         }
         return ans;
  
    }
    public int div(int nums[],int m)
    {
        int sq=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%m==0)
            sq=sq+(nums[i]/m);
            else
            sq=sq+((nums[i]/m)+1);
        }
       
        return sq;


    }
}