class Queue {
    int front, rear, size;
    int cap;
    int[] arr;

    public Queue(int c){
        cap = c;
        front = size = 0;
        rear = -1;
        arr = new int[c];
    }

    boolean isEmpty()
    {
        return (size == 0);
    }
    boolean isFull(){
        return (size == cap);
    }
    void enqueue(int item)
    {
        if(!isFull()){
            if(rear == cap-1){
                rear = -1;
            }

            arr[++rear] = item;
            size++;
        }
    }
    int dequeue()
    {
        int data = arr[front++];
        if(front == cap){
            front = 0;
        }
        size--;
        return data;
    }

    public static void main(String[] args){
        Queue q = new Queue(14);
        int i=10;
        while(i>0){
            q.enqueue(i);
            System.out.print(i +" ");
            i--;
        }
        System.out.println();
        while(!q.isEmpty()){
            int n = q.dequeue();
            System.out.print(n +" ");
        }
    }
}
