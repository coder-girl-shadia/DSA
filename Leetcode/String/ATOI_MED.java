class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int num=0;
        boolean neg=s.startsWith("-");
         boolean pos=s.startsWith("+");
       int i=0;
       if(neg)
      i++;
      if(pos)
      i++;
        
       

        for(;i<s.length();i++)
    
        {
            char c=s.charAt(i);
           // System.out.println(c);
            if(c>= '0' && c<='9') 
            {
                num=num*10+(c-'0');
            }
            else
            break;
         }
       
        if(neg)
        num=-num;
        
        
            if(num<(-2147483648))
            num=-2147483648;
        
        else if(num>(2147483647))
        num=2147483647;
        else
        return num;

       return 0; 
        
    }
}