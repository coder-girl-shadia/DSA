class Solution {
    List<List<Integer>>result=new ArrayList<>();
    public void findsum(int i,int arr[],List<Integer>ds,int t)
    {
        if(i==arr.length)
        {
            if(t==0)
            result.add(new ArrayList<>(ds));
            return;

        }

        if(t>=arr[i])
        {
        ds.add(arr[i]);
        findsum(i,arr,ds,t-arr[i]);
        ds.remove(ds.size()-1);
        }
         findsum(i+1,arr,ds,t);
 
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        findsum(0,candidates,new ArrayList<>(),target);
        return result;
        
    }
}