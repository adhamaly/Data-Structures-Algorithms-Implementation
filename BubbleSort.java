public class BubbleSort {

  public static int[] Sort(int[] array){
      int temp;
      for (int i = 0; i < array.length; i++) {
          for (int j =0; j < array.length-i-1; j++) {
              if(array[j] > array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
              }
              
          }

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
