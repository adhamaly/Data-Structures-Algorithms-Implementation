import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

/*
    Scanner input = new Scanner(System.in);
    
    // adding 5 StudentNames into LinkedList
    LinkedListADT<String> StudentsList = new LinkedListADT<>();
    int i = 0;
    while(i<5){
    StudentsList.insertAtTop(input.nextLine());
    i++;
    }
    StudentsList.printLinkedList();
    //------------------------------------------

    // adding 5 people in Queue which are waiting ..

    QueueADT<String> queuedPeople = new QueueADT<>(5);
    int x = 0;
    while(x<5){
        queuedPeople.Enqueue(input.nextLine());
    x++;
    }
    queuedPeople.printQueue();
    // dequeue first 2 people
    queuedPeople.dequeue();
    queuedPeople.dequeue();
    queuedPeople.printQueue();

    //---------------------------------------
    // adding 6 books in box and then pop first 3 books
    StackADT<String> Box = new StackADT<>(6);
    int y = 0;
    while(y<6){
        Box.push(input.nextLine());
    y++;
    }
    Box.printStack();
    Box.pop();
    Box.pop();
    Box.pop();
    Box.printStack();
    
    //--------------------
    int[] ages = {21,12,13,14,16,22,32,33};
    SelectionSort.Sort(ages);
    System.out.print("selection Sort ... ");
    SelectionSort.printSortedArray(ages);
    System.err.print("\n");
    //------------------------------
    InsertionSort.Sort(ages);
    System.out.print("Insertion  Sort ... ");
    InsertionSort.printSorted(ages);
    System.err.print("\n");
    //--------------------------------
    BubbleSort.Sort(ages);
    System.out.print("Bubble Sort ... ");
    BubbleSort.printSorted(ages);
    System.err.print("\n");
  
*/
    // Search an array using Linear Search
    int[] employeeId = {101,102,103,104,105,106,107};
    int id = new LinearSearch().Search(employeeId, 104);
    System.out.println("employee Id = "+id);

    int id2 = new BinarySearch().Search(employeeId, 104);
    System.out.println("employee Id = "+id2);

    int[] a = {19,8,-13,2,-5,4,100,30};
    MergeSort.Sort(a,0, a.length-1);
    MergeSort.printSorted(a);

    System.out.println(Period.between(LocalDate.of(1999, 3, 1), LocalDate.now()).getYears());

    StackADT<Character> s = new StackADT<>(10);
    s.push('a');
    s.push('b');
    s.push('c');
    System.out.println(s.isEmpty());
    System.out.println(s.contain('b'));
    System.out.println(s.getSize());

    QueueADT<Character> q = new QueueADT<>(10);
    q.Enqueue('a');
    q.Enqueue('b');
    q.Enqueue('c');
    System.out.println(q.isEmpty());
    System.out.println(q.contain('b'));
    System.out.println(q.getSize());

    LinkedListADT<Character> l = new LinkedListADT<>();
    l.insertAtTop('a');
    l.insertAtTop('b');
    l.insertAtTop('c');

    System.out.println("index of b "+l.contain('c'));
    System.out.println(l.getSize());



  
    



    
    }
}
