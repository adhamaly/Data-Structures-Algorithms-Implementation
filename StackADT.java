public class StackADT<T> {
    
    private int last = -1;
    private T[] a;
    private int size;

    public StackADT(int _size){
        this.size = _size;
        a = (T[]) new Object[this.size];

    }

    public void push(T item){
        if(last<a.length){
            last++;
            a[last] = item;
        }
        else{
            System.out.println("stack is full");
        }
        
    }
    public void pop(){
        a[last] = null;
        last--;

    }
    public T peek(){
        if(last == -1){
            return null;
        }
        else{
            return a[last];
        }

    }
    public void printStack(){
        System.out.print("[");
        for (int i = last; i >-1; i--) {
            System.out.print(a[i]+",");

        }
        System.out.print("]");

    }

    
}
