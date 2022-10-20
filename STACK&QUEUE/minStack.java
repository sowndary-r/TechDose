class MinStack {
  int min;
    Stack<Integer> stk=new Stack<>();
    public MinStack() {
        this.min=Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {
    if(val<=min)
    { stk.push(min);
     min=val;}
        stk.push(val);
       
    }
    
    public void pop() {
      if(stk.pop()==min)
          min=stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min;
        
    }
}
