class Solution {
    public boolean rotateString(String s, String goal) {

         String ns=" ";
         int k=0;
        if(s.equals(goal))
        return true;
        for(int i=0;i<s.length()-1;i++)
        {
            ns=s.substring(i+1,s.length())+s.substring(0,i+1);
             if(ns.equals(goal))
             {
                k=1;
             return true;
             }

        }
        
       
        if(k==0)
        return false;
        else 
        return false;
        
    }
}