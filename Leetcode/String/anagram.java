class Solution {
    public boolean isAnagram(String s, String t) {
        int k=0,h=0;
        
        if(s.length()!=t.length())
        {
           return false;
        }
        for(int i=0;i<s.length();i++)
        {
                    k=0;
            char c1=s.charAt(i);
            for(int j=0;j<t.length();j++)
            {
                if(c1==t.charAt(j))
                k++;


            }
            if(k==0)
            {
                h=1;
                break;
            }
            

        }
        if(h==1)
        return false;
        else
        return true;
        
    }
}