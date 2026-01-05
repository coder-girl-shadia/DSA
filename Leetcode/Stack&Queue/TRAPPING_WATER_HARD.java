class Solution {
    public int trap(int[] height) {
        
        int pm[]=findPrefixMax(height);
         int sm[]=findSuffixMax(height);
         int tunits=0;
         for(int i=0;i<height.length;i++)
         {
             int lmax=pm[i];
             int rmax=sm[i];
             if(pm[i]>height[i] && sm[i]> height[i])
             {
                tunits=tunits+(Math.min(lmax,rmax)-height[i]);
             }
             
            
         }
         return tunits;


    }
    public int[] findPrefixMax(int height[])
    {
          int pm[]=new int[height.length];
          pm[0]=height[0];
          for(int i=1;i<height.length;i++)
          {
            pm[i]=Math.max(height[i],pm[i-1]);
            
          }
          return pm;


    }
    public int[] findSuffixMax(int height[])
    {
          int sm[]=new int[height.length];
          sm[height.length-1]=height[height.length-1];
          for(int i=height.length-2;i>0;i--)
          {
            sm[i]=Math.max(height[i],sm[i+1]);
            
          }
          return sm;

    }
}