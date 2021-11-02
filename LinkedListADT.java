public class LinkedListADT<T extends Comparable<T>> {

    class Node{
        Node next;
        T value;

        

    }

    Node head = null;

    public LinkedListADT(){
    

    }

    public void insertAt(T item,int index){
        Node insertedNode = new Node();
        int i ;
        if(head == null){
            insertedNode.value = item;
            insertedNode.next = null;
            head = insertedNode;
        }else{
            Node currentNode = head;
            
            i= 1;
            while(currentNode.next!=null){
                if(index == i){
                    break;
                }
                currentNode = currentNode.next;

            }
            insertedNode.value = item;
            insertedNode.next = currentNode.next;
            currentNode.next = insertedNode;
        }

    }

    public void insertAtTop(T item){

        Node insertedNode = new Node();
        if(head == null){
            insertedNode.next = null;
            insertedNode.value = item;
            head = insertedNode;
        }
        else{
            Node currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            insertedNode.value = item;
            insertedNode.next = null;
            currentNode.next = insertedNode;


        }
    }

    public T getTop(){
        if(head == null){
            return null;
        }
        else{
            Node currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }

            return currentNode.value;
        }

    }
    public T getAtIndex(int index){
        if(head == null){
            return null;
        }
        else{
            int i = 0;
            Node currentNode = head;
            while(currentNode.next!=null){
                if(i == index){
                    break;
                }
                currentNode = currentNode.next;
                i++;
        }
        return currentNode.value;
    }
}

    

    public void printLinkedList(){
        if(head == null){
            System.out.println("empty linked List");
        }
        else{
            Node currentNode = head;
            System.out.print("[");
            while(currentNode!=null){
                System.out.print(currentNode.value+",");
                currentNode = currentNode.next;
               
            }
            System.out.print("]");

            
        }

    }
    public void removeTop(){
        if(head == null){
            System.out.println("empty linked List");
        }
        else if(head.next == null){
            head = null;
        }else{
            Node currentNode = head;
            while(currentNode.next.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }

    }
    public void removeAtIndex(int index){
        int i;
    
        if(head  == null){
            System.out.println("empty linked list");
        }
        else if (head.next == null){
            head =null;
        }
        else{
            i = 1;
            Node currentNode = head;
            while(currentNode.next!=null){
                if(index == i){
                    break;
                }
                currentNode = currentNode.next;
                
                i++;
            }
            currentNode.next = currentNode.next.next;

        }

    }


    public int contain(T item){

        if(head == null){
            return -1;
        }
        else{
            int i= 0;
            Node node = head;
            while(node!=null){
              
                if(node.value == item){
                    return i;
                }
                node  = node.next;
                i++;
            }
        }
        return -1;



    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        int i= 0;
        if(head == null){
            return -1;
        }
        else{
            Node node = head;
            while(node!=null){
              
                node  = node.next;
                i++;
            }
        }
        return i;

        
    }
    public T getMax(){
    
   
        if(isEmpty()) return null;
        Node currNode = head;
        T max = currNode.value;
        while(currNode!=null){
            if(currNode.value.compareTo(max) >0){
                max = currNode.value;
            }
            currNode = currNode.next;

        }
        return max;

    
    }

    
}
