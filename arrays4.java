import java.util.*;
public class arrays4 {
    public static void main(String[] args) {
       
       int arr[] ={1,2,3,0,4,5,0,6,7,0,0,8};
       int prev=0;
       int c=0;
       int n=arr.length;
       for(int i=0;i<n;i++){
           
               if(arr[i]!=0){
                   arr[c]=arr[i];
                   c++;
               }}
                
           
           
           
          while(c<n){
              arr[c++]=0;
          }
       
       System.out.println(Arrays.toString(arr));
      
      }
}
