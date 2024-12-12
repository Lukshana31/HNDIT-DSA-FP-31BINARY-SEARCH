package BAT_IT_2022_P_31;

public class Binarysearch {
    
   
    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        // While loop to search the array
        while (low <= high) {
            int mid = (low + high) / 2; 
            
            // If target is found at mid, return true
            if (arr[mid] == target) {
                return true;
            }
            
            // If target is smaller than mid, search the left half
            if (arr[mid] > target) {
                high = mid - 1;
            }
            
            else {
                low = mid + 1;
            }
        }
        
        
        return false;
    }

    public static void main(String[] args) {
      
        int[] arr = {1, 3, 5, 7, 9};
        int target = 7;
        
      
        boolean result = binarySearch(arr, target);
        
      
        System.out.println(result); 
    }
}

