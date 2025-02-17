import java.util.*;
public class homework17_02 {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
        int x= sc.nextInt();
         System.out.println("enter the number of terms:");
         int n=sc.nextInt();
       
    
        int sum = 0;  
        int currentTerm = 0;  

       
        for (int i = 1; i <= n; i++) {
            currentTerm = currentTerm * 10 + x;  
            sum += currentTerm;  
        }

        
        System.out.println("Sum of the series is: " + sum);
        
    }}

      
      
        
    

   


