class Solution {
    public int sumSubarrayMins(int[] arr) {
       int nse[]= findNSE(arr);
       int pse[]= findPSEE(arr);
       int total=0;
       int mod=(int)1e9+7;
       for(int i=0;i<arr.length;i++)
       {
           int right=nse[i]-i;
           int left=i-pse[i];
           
           total=(total+((left*right*arr[i])%mod))%mod;
       }
        return total;
        
    }
    public int[] findNSE(int arr[])
    {
        Stack<Integer>stkr=new Stack<>();
        int nse[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        { 
            while(!stkr.isEmpty() && arr[stkr.peek()]>=arr[i])
            {

                stkr.pop();
            }
           nse[i]=(stkr.isEmpty()?arr.length:stkr.peek());
           stkr.push(i);

        }
        return nse;
          
    }
     public int[] findPSEE(int arr[])
    {
        Stack<Integer>stkl=new Stack<>();
        int pse[]=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++)
        { 
            while(!stkl.isEmpty() && arr[stkl.peek()]>arr[i])
            {

                stkl.pop();
            }
           pse[i]=(stkl.isEmpty()?-1:stkl.peek());
           stkl.push(i);

        }
        return pse;
          
    }


}