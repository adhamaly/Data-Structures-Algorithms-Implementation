public class MergeSort {

    // Main function that sorts arr[l..e] using
    // merge()
   public static void Sort(int arr[], int s, int e)
    {
        if (s < e) {
            // Find the middle point
            int m =s+ (e-s)/2;
  
            // Sort first and second halves
            Sort(arr, s, m);
            Sort(arr, m + 1, e);
  
            // Merge the sorted halves
            merge(arr, s, m, e);
        }
    }
   
    
    public static void merge(int arr[], int s, int m, int e)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - s + 1;
        int n2 = e - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[s + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = s;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    
    protected static void printSorted(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +",");
        }
        System.out.print("]");

    }

    
    
    
}
