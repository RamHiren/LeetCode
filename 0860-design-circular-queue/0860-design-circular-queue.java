class MyCircularQueue {
    int[] a;
    int f;
    int r;
    int c;
    int s;
    public MyCircularQueue(int k) {
        a = new int [k];
        c=k;
        s=0;
        f=r=-1;
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            if(isEmpty()) f=0;
            r = (r+1) % c;
            s++;
            a[r]=value;
            return true;
        }
        return false;

    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            if(r==f){
                f=r=-1;
            }else{
                f = (f+1)%c;
            }
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(!isEmpty()){
            return a[f];
        }
        return -1;
    }
    
    public int Rear() {
        if(!isEmpty()){
            return a[r];
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if(f==-1 && f<c){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(f==0 && f==c-1||((r+1)%c==f)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */