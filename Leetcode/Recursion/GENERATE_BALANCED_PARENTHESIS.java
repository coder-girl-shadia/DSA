class Solution {
    List<String>result;
    void solve(String curr,int n,int o,int c)
    {
        if(curr.length()==2*n)
        {
            result.add(curr);
        }
        if(o<n)
        {
        solve(curr + "(", n, o + 1, c);
        }
        if(c<o)
        {
         solve(curr + ")", n, o, c + 1);
        }


    }
    public List<String> generateParenthesis(int n) {
        result=new ArrayList<>();
        String curr="";
        int o=0,c=0;
        solve(curr,n,o,c);
        return result;
      
    }
}