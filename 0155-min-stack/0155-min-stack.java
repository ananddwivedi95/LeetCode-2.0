class MinStack {
   Stack<Integer> stack;
   Stack<Integer> minStack;
    public MinStack() {
        stack=new Stack<>();
        minStack= new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()||minStack.peek()>=val)
        {
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek()))
        {
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty())
        {
            return -1;
        }
       return stack.peek();
    }
    
    public int getMin() {
        if(minStack.isEmpty())
        {
            return -1;
        }
        return minStack.peek();
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