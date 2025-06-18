class Solution {
    public int kthElement(int[] a, int[] b, int k) {

        int i=0,j=0,c=1;
        int el=-1;


        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                if(c==k)
                el=a[i];
                i++;
                c++;
            }
            else
            {
                if(c==k)
                el=b[j];
                j++;
                c++;

            }

        }
        while(i<a.length)
        {
           if(c==k)
           el=a[i];
           i++;
           c++;

        }
        while(j<b.length)
        {
            if(c==k)
            el=b[j];
            j++;
            c++;


        }
        return el;
      
          }
}
