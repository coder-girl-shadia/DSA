class MinStack {
    Stack<Integer>stk;
    Stack<Integer>minstk;
    

    public MinStack() {
       stk=new Stack<>(); 
       minstk=new Stack<>(); 
    }
    
    public void push(int val) {
        stk.push(val);
         if(minstk.isEmpty()||val<minstk.peek())
         minstk.push(val);
         else
          minstk.push(minstk.peek());
        
        
    }
    
    public void pop() {
        if(!stk.isEmpty())
        stk.pop();
        minstk.pop();
        
    }
    
    public int top() {
        if(!stk.isEmpty())
        return stk.peek();
        return 0;
    }
    
    public int getMin() {

     if(!minstk.isEmpty())
      return minstk.peek();
      else
      return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */