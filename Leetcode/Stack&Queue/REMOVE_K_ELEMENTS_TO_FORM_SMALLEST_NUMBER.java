class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);
            while(!stk.isEmpty() && k>0 && stk.peek()>ch)
            {
                stk.pop();
                k--;
            }
            stk.push(ch);
        }
        while(!stk.isEmpty() && k>0)
        {
            stk.pop();
            k--;
        }
        if(stk.isEmpty())
        return "0";
         String ns="";
         while(!stk.isEmpty())
         {
            ns=stk.pop()+ns;
         }
         //System.out.println(ns);
         String fs="";
         int c=0;
         int i=0;
         for( i=0;i<ns.length();i++)
         {
            if(ns.charAt(i)!='0')
            {
            c=i;
            break;
            }
         }
         if(i==ns.length())
         return "0";
         fs=ns.substring(c);

         if(fs.length()==0)
         return "0";

         return fs;

}
}