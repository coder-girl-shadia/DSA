class Solution {
    public int[] asteroidCollision(int[] asteroids) {    //[4,7,1,1,2,-3,-7,17,15,-18,-19]
        
        Stack<Integer>stk=new Stack<>();
        
        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]>0)
            stk.push(asteroids[i]);
            else
            {
            while(!stk.isEmpty() && stk.peek()>0 && stk.peek()<(-asteroids[i]))
            {
                stk.pop();
            }
            if(!stk.isEmpty() && stk.peek()==Math.abs(asteroids[i]))
            stk.pop();
            else if(stk.isEmpty() || stk.peek()<0)//the only case when negative number will enter into stack
             stk.push(asteroids[i]);
            }
          
        }
        int arr[]=new int[stk.size()];
        int k=stk.size()-1;
        while(!stk.isEmpty())
        {
            //System.out.println(stk.peek());
            arr[k]=stk.pop();
            k--;

        }
        return arr;

        
    }
}