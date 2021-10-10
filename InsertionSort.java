public class InsertionSort  {

    public static int[] Sort(int[] array){
        
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while((j>-1)&&( array[j] > temp)  ){
                array[j+1] =array[j];

                j--;    
                
        }
        array[j+1] = temp; 
    }
    return array;
}
public static void printSorted(int[] array){
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] +",");
    }
    System.out.print("]");

}
}
