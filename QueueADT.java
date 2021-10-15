public class QueueADT<T>{
    private int size;
    private int first = 0;
    private int top = -1;
    private T[] a;

    public QueueADT(int _size){
        this.size = _size;
        a = (T[]) new Object[this.size];

    }
    public void Enqueue(T item){
        if(top < a.length){
            top++;
            a[top] = item;
        }else{
            System.out.println("Queue overFlow");
        }

    }
    public T dequeue(){
        if(top == -1){
            return null;
        }
        else{
            var item =  a[first];
            a[first] = null;
            first++;
            return item;
        }

    }
    public void printQueue(){
        System.out.print("[");
        for (int i = first; i <=top ; i++) {
            System.out.print(a[i]+",");

        }
        System.out.print("]");
    }


    public int contain(T item){
        
        
        for (int i = 0; i < a.length; i++) {
            if(item == a[i]){
                return i;
            }
            
        }
        return -1;
        
      
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public int getSize(){
        return top+1;
    }

}