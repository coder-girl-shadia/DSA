class Solution {
    public boolean isValid(String s) {
     Stack<Character>stk=new Stack<>();
     for(int i=0;i<s.length();i++)
     {
        char curr=s.charAt(i);
        if(!stk.isEmpty())
        {
            char last=stk.peek();
            if(ispair(curr,last))
            {
                stk.pop();
                continue;
            }
        }
        stk.push(curr);

     }
       return stk.isEmpty(); 
    }
    public boolean ispair(char curr,char last)
    {
        if(last=='(' && curr==')' ||last=='{' && curr=='}' ||last=='[' && curr==']')
        return true;
        else
        return false;
    }
}