import java.util.*;
public class arrays3 {
    public static void main(String[] args) {
       
       int arr[] ={1,1,1,1,1,0,1,1,0,0,1,1,0};
       int prev=0;
       int c=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==1)
           {
               c++;
          }
            if(arr[i]==0)
          {
              
              prev=Math.max(c,prev);
              c=0;
              
          }
        
       
         
           
       } 
       System.out.println(prev);
      
      }
}
