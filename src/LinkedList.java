class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public void insertFirst(int new_d){
        Node new_node = new Node(new_d);

        new_node.next = head;

        head = new_node;
    }
    public void insert(Node prev_node,int new_d){
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_d);

        new_node.next = prev_node.next;

        prev_node.next = new_node;
    }
    public void insertLast(int new_d)
    {
        Node new_node = new Node(new_d);

        if (head == null)
        {
            head = new Node(new_d);
            return;
        }

        new_node.next = null;

        Node last = findLast();
        last.next = new_node;
    }
    public void deleteNode(int key)
    {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key)
        {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;
    }

    public int countNode(){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public boolean search(int x)
    {
        Node temp = head;
        while (temp != null)
        {
            if (temp.data == x)
                return true;
            temp = temp.next;
        }
        return false;
    }
    public Node findLast(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public void concat(LinkedList list){
        if(head == null){
            head = list.head;
        }
        if(list.head == null) return;

        Node last = findLast();
        last.next = list.head;
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;
        llist.printList();
        System.out.println();

        llist.insertFirst(0);
        llist.printList();
        System.out.println();

        llist.insert(second, 9);
        llist.printList();
        System.out.println();

        llist.insertLast(10);
        llist.printList();
        System.out.println();

        llist.deleteNode(9);
        llist.printList();
        System.out.println();

        System.out.println("Number of node is: "+llist.countNode());

        if(llist.search(3)) System.out.println("There is a node with searched value");

        LinkedList list2 = new LinkedList();
        list2.insertFirst(9);
        list2.insertFirst(21);
        list2.insertFirst(15);

        llist.concat(list2);
        llist.printList();
        System.out.println();
    }
}