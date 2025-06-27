import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        String ns="";
        int k=0;
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];

       // System.out.println(f+""+l);
       if(strs.length==0)
       return "";
      else if(f.charAt(0)!=l.charAt(0))
       return "";
       else{
        for(int i=0;i<f.length();i++)
        {
            if(f.charAt(i)==l.charAt(i))
            ns=ns+f.charAt(i);
            
           


        }
        return ns;
       }
       
       
    
    }
}