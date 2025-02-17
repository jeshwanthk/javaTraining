import java.util.*;
public class arrays8 {
 
    public static void main(String[] args) {
       
        int[] arr = {1, 2, 3, 4, 5,6};
        int n = 3;
        
        
         for (int i = 0; i < arr.length; i += n) {
            int left = i;
            int right = Math.min(i + n - 1, arr.length - 1);

            
            while (left < right) {
                
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                
                left++;
                right--;
            }
        }
       
       

      
        System.out.println("Rearranged array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

   
}

