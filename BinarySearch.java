public class BinarySearch implements SearchHelper{

    @Override
    public int Search(int[] array, int e) {

        int end = array.length-1;
        int start = 0;
        int mid= 0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(e == array[mid]){
                return mid;
            }
            else if(e > array[mid]){
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return -1;
        
       
    }
    
}
