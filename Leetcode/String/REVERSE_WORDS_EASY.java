import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String ns="";

        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            String w=st.nextToken();
            ns=w+" "+ns;



        }
        return ns.trim();
        
    }
}