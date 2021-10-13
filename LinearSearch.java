public class LinearSearch  implements SearchHelper{

    @Override
    public int Search(int[] array, int e) {

        for (int i = 0; i < array.length; i++) {
            if(e == array[i]){
                return i;
            }
            
        }
        return -1;
        
       
    }
    
}
