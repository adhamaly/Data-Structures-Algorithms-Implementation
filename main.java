 class Main {
    public static void main(String[] args) {
        
        /*
        StackADT<Integer> s = new StackADT<>(10);       
        s.push(10);
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);

        s.printStack();
        s.pop();
        s.printStack();
        int x = s.peek();
        System.out.println(x);

        QueueADT<Character> q = new QueueADT<>(10);
        q.Enqueue('a');
        q.Enqueue('b');
        q.Enqueue('c');
        q.Enqueue('d');

        q.dequeue();
        q.dequeue();

        q.printQueue();

        System.out.println("------------------------------------------");
        LinkedListADT<Integer> l  = new LinkedListADT<>();
        l.insertAtTop(1);
        l.insertAtTop(2);
        l.insertAtTop(3);
        l.insertAtTop(4);
        l.printLinkedList();

        int ltop =l.getTop();
        int lindex = l.getAtIndex(2);
        System.err.println(ltop + "  ,  "+lindex);
        l.insertAt(6, 1);

        l.printLinkedList();
        System.out.println("\n after delete-------------------------");

        l.removeTop();

        l.printLinkedList();
        ltop = l.getTop();
        lindex = l.getAtIndex(2);
        System.err.println(ltop + "  ,  "+lindex);
        l.printLinkedList();

        l.removeAtIndex(2);
        System.out.println("\n-------------------------");

        l.printLinkedList();
System.out.println("\n-------------------------");
        LinkedListADT<Integer> l2  = new LinkedListADT<>();
        l2.insertAtTop(1);
        l2.printLinkedList();
       int  l2top =l2.getTop();
       System.out.println(l2top);
       l2.removeTop();
       l2.printLinkedList();

*/
        int[] array = {4,2,6,5,3,1};
       
        array = BubbleSort.Sort(array);
        BubbleSort.printSorted(array);



    }
}
