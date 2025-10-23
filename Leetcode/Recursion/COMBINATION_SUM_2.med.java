class Solution {
    List<List<Integer>>result=new ArrayList<>();
    public void findsum(int i,int arr[],List<Integer>ds,int t)
    {
        
            if(t==0)
            {
            result.add(new ArrayList<>(ds));//ads a copy of ds to result
            return;
            }

            for(int k=i;k<arr.length;k++)
            {
                if(k>i && arr[k]==arr[k-1])
                {
                    continue;
                }
               if(t<arr[k])
               break;
                
               ds.add(arr[k]);
               findsum(k+1,arr,ds,t-arr[k]);
               ds.remove(ds.size()-1);

                
            }

        

        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        findsum(0,candidates,new ArrayList<>(),target);
        return result;
        
    }
}