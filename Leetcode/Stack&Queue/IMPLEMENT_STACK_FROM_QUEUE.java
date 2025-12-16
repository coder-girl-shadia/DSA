class MyStack {
       Queue<Integer>q;
    public MyStack() {
        q=new LinkedList<>();
        
    }
    
    public void push(int x) {

        int s=q.size();
        q.offer(x);
        for(int i=1;i<=s;i++)
        {
            q.offer(q.peek());  //offer:Inserts element, returns false if full
                         //peek:Returns head without removing, returns null if empty
            q.poll();//poll:Removes and returns head element, returns null if empty

        }
        
    }
    
    public int pop() {
       return q.poll();
        
    }
    
    public int top() {
        return q.peek();
        
    }
    
    public boolean empty() {
        if(q.size()==0)
        return true;
        else
       return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */