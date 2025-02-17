import java.util.*;
public class arrays2 {
    public static void main(String[] args) {
       
       int arr[] ={1,2,3,4,5};
       int max=arr[0];
       int max2=0;
       for(int i=1;i<arr.length;i++)
       {
           if(arr[i] > max)
           {
                max=arr[i];
           }
           max2=arr[i-1];
           
       }
       
       System.out.println(max);
       System.out.println(max2);
       
       
       Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
      }
}
