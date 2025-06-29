class MyStack {
    Queue<Integer> q1= new LinkedList<>();
    Queue<Integer> q2= new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
         q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    
    public int pop() {
        if(!q1.isEmpty())return q1.poll();
        return -1;
    }
    
    public int top() {
        if(!q1.isEmpty()) return q1.peek();
        return -1;
    }
    
    public boolean empty() {
        if (!q1.isEmpty())return false;
        return true;
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