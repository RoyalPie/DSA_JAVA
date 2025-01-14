class Stack {
    static final int MAX = 100;
    int top;
    int[] a = new int[MAX];
    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }
    void push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }
    void pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println("Popped: "+a[top--]);
        }
    }
    void display(){
        if(isEmpty()) {
            System.out.println("Stack empty");
            return;
        }
        System.out.print("Stack : [");
        for(int i = 0; i<= top; i++)
        {
            if(i>0) System.out.print(",");
            System.out.print(" "+a[i]);
        }
        System.out.println(" ]");
        System.out.println();
    }
    public static void main(String[] args){
        Stack a = new Stack();
        a.push(9);
        a.push(2);
        a.push(1);
        a.push(14);
        a.display();
        a.pop();
        a.display();
    }
}
