import java.util.*;
public class arrays9 {
 
    public static void main(String[] args) {
       
      Scanner input=new Scanner(System.in);
      
      String a=input.nextLine();
      char[] arr=a.toCharArray();
      int n=arr.length,count=1;
       
       
      for(int i=0;i<n;i++){
          if(arr[i]!='d'){
              for(int j=i;j<n;j++){
                  if(i==j) continue;
                  if(arr[i] == arr[j]){
                      count++;
                      arr[j]='d';
                  }
              }
              System.out.println(arr[i]+":"+ count);
          }
          count=1;
      }
        
    }}

      
      
        
    

   


