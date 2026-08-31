class MinStack {
    Stack<Long> s = new Stack<>();
    long minval;

    public MinStack() {
        
    }
    
    public void push(int value) {
        long val = value;
        if(s.empty()){
            s.push(val);
            minval = val;
        }
        else{
            if(val < minval){
                s.push(2*val - minval);
                minval = val;
            }else{
                s.push(val);
            }
        }
    }
    
    public void pop() {
        if(s.peek() < minval){
            minval = 2*minval-s.peek();
        }
        s.pop();
    }
    
    public int top() {
        long top = s.peek();
        if(top < minval){
            return (int)minval;
        }
        else{
            return (int)top;
        }
    }
    
    public int getMin() {
        return (int) minval;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */