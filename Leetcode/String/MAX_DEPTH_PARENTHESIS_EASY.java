class Solution {
    public int maxDepth(String s) {
        int max=0,c=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
            c++;
            max=Math.max(max,c);
            }
            else if(s.charAt(i)==')')
            c=c-1;
            else
            c=c;

        }
        return max;
        
    }
}