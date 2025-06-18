class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int tl=nums1.length+nums2.length;
            int i=0,j=0,c=0;
            int in2=tl/2;
            int in1=in2-1;
            int in1el=-1;
            int in2el=-1;
            while(i<nums1.length && j<nums2.length )
            {
                if(nums1[i]<nums2[j])
                {
                 
                  if(c==in1)
                  in1el=nums1[i];
                  if(c==in2)
                  in2el=nums1[i];
                  i++;
                   c++;

                }
                else
                {
                     
                  if(c==in1)
                  in1el=nums2[j];
                  if(c==in2)
                  in2el=nums2[j];
                  j++;
                  c++;

                }
            }
            if(i<nums1.length)
            {
                
                if(c==in1)
                  in1el=nums1[i];
                  if(c==in2)
                  in2el=nums1[i];
                  i++;
                  c++;
            }
            if(j<nums2.length)
            {
                
                if(c==in1)
                  in1el=nums2[j];
                  if(c==in2)
                  in2el=nums2[j];
                  j++;
                  c++;

            }
            System.out.println(in1el+" "+in2el);

            if(tl%2==0)
            return (in1el+in2el)/2.0;
            else
            return (double)in2el;
                           
        }
}