class MinStack {
    ArrayList<Integer> s;
    int top;
    public MinStack() {
       s=new ArrayList<>();
       top= -1;

    }
    
    public void push(int val) {
        s.add(val);
        top++;

    }
    
    public void pop() {
        
        s.remove(top);
        top--;
    }
    
    public int top() {
        return s.get(top);
        
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s.size();i++){
            if(s.get(i)<min){
                min = s.get(i);
            }
        }
        return min;
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