class MyCircularQueue {
    int[] q;
    int rear;
    int front;
    int count;
    int size;

    public MyCircularQueue(int k) {
         q = new int[k];
         rear = 0;
         front = 0;
         count = 0;
         size = k;

        
    }
    
    public boolean enQueue(int value) {
       if(count == size) return false;
       q[rear] = value;
       rear = (rear+1)%size;
       count = count +1;
       return true ; 
    }
    
    public boolean deQueue() {
       if(count == 0) return false;
       
       front = (front+1)%size;
       count = count -1;
       return true ; 
        
    }
    
    public int Front() {
        if (count == 0) return -1;
        return q[front];
    }
    
    public int Rear() {
       if(count == 0) return -1;
       return q[(rear -1 +size)%size] ; 
        
    }
    
    public boolean isEmpty() {
        return count ==0;
    }
    
    public boolean isFull() {
        return count == size;
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