public class MergeSort {

    public static void merge(int[] left_arr,int[] right_arr, int[] arr,int leftArraysize, int rightArraysize){
      
        int i=0,l=0,r = 0;
        //The while loops check the conditions for merging
        while(l<leftArraysize && r<rightArraysize){
            
            if(left_arr[l]<right_arr[r]){
                arr[i++] = left_arr[l++];
            }
            else{
                arr[i++] = right_arr[r++];
            }
        }
        while(l<leftArraysize){
            arr[i++] = left_arr[l++];
        }
        while(r<rightArraysize){
          arr[i++] = right_arr[r++];
        }
    }
    public static void Sort(int[] array,int len){

        if(len < 2){return;}
        
        int mid = len/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[len-mid];

        int k=0;
        for (int i = 0; i < len; ++i) {
            if(i<mid){
                leftArray[i] = array[i];
            }else{
                rightArray[k] = array[i];
                k++;
            }
            
        }

        Sort(leftArray, mid);
        Sort(rightArray, len- mid);

        merge(leftArray,rightArray,array,mid,len-mid);


    }
   
    protected static void printSorted(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +",");
        }
        System.out.print("]");

    }
    
    
}
