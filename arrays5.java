import java.util.*;
public class arrays5 {
    public static void main(String[] args) {
       
       int arr[] ={1,1,1,0,0,1,0,0,1,1,0};
       int prev=0;
       int c=0;
       int n=arr.length;
       for(int i=0;i<n;i++){
           
               if(arr[i]==1){
                   arr[c]=arr[i];
                   c++;
               }}
                
           
           
           
          while(c<n){
              arr[c++]=0;
          }
       
       System.out.println(Arrays.toString(arr));
      
      }
}
