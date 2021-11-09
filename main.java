import java.lang.Character.UnicodeBlock;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



class Main {
    public static void main(String[] args) {

        /*
         Scanner input = new Scanner(System.in);
         
         
         
        QueueADT<Integer> q = new QueueADT<>(Integer.class,10);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(12);
        q.Enqueue(4);
        q.Enqueue(9);
        q.printQueue();
        int x =q.getMax();
        System.out.println(x);

        LinkedListADT<Integer> l  = new LinkedListADT<>();
        l.insertAtTop(1);
        l.insertAtTop(4);
        l.insertAtTop(2);
        l.insertAtTop(100);
        System.out.println(Integer.valueOf(l.getMax()));    
        
        StackADT<Double> s =new StackADT<>(Double.class, 10);
        s.push(1.9);
        s.push(3.9);
        s.push(5.9);
        s.push(7.9);
        System.out.println(s.getMax());
    
*/
     
        BinaryTree tree = new BinaryTree();
        tree.insert(6);
        tree.insert(4);
        tree.insert(8);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);

        tree.PreOrderTraversePrint(tree.getTreeRoot());
        System.out.println("\n");
        tree.InOrderTraversePrint(tree.getTreeRoot());
        System.out.println("\n");
        tree.PostOrderTraversePrint(tree.getTreeRoot());
        System.out.println("\n");
        tree.levelOrderTraverse();
        System.out.println("\n"+tree.getTreeRoot().value);
                    
       
    } 
}
