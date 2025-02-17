import java.util.*;
public class arrays10 {
 
    public static void main(String[] args) {
       
      Scanner input=new Scanner(System.in);
      
      String a=input.nextLine();
      char[] arr=a.toCharArray();
      int n=arr.length,count=1;
       
       
      for(int i=0;i<n;i++){
          
          boolean duplicate=false;
          for(int j=0;j<i;j++){
              if(arr[i]==arr[j]){
                  duplicate=true;
                  continue;
              }
          }
          if(!duplicate){
              System.out.println(arr[i]);
          }
      }
        
    }}

      
      
        
    

   


