import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 1, 3, 2};
        int len=arr.length;
        int n=1;
        
        int mid = 2;
        int[] arr1=new int[len];
        int j=0;
        for (int i = len-1; i >len-1-n ; i--) {
            arr1[j]=arr[i];
            System.out.print(arr1[j] + " ");
            j++;
        }
        for (int i = 0; i < len-n; i++) {
            arr1[i]=arr[i];
            System.out.print(arr1[i] + " ");
        }
    }
}
