package Leetcode.GREEDY_ALGO;

public class VALID_PARENTHESIS {
    class Solution {
    public boolean checkValidString(String s) {

      int min=0,max=0;
      for(int i=0;i<s.length();i++)
      {
         if(s.charAt(i)=='(')
         {
            min++;
            max++;
         }
        else if(s.charAt(i)==')')
         {
            min--;
            max--;

         }
         else
         {
            min=min-1;
            max=max+1;
         }
         if(min<0)
         min=0;
         if(max<0) //max has to be positive
         return false;

      }

      return (min==0);
   
    }
}
    
}
