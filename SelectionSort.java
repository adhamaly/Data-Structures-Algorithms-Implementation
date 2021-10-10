public class SelectionSort  {

    public static int[] Sort(int[] array){
        int min,temp;
        for (var i = 0; i < array.length; i++) {
            min = i;
            for (var j = i; j < array.length; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }
        return array;

    }
    

    public static void printSortedArray(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +",");
        }
        System.out.print("]");




    }

   
}

    
  
        
    
    

