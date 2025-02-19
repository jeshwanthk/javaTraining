import java.util.*;
public class Diagonal_Swapping
{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int row=0,col=0,curr=0,prev=0;
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] num1=new int[r][c];
		int n=num1.length;
	    for(int i=0;i<r;i++){
	      for(int j=0;j<c;j++){
	          	System.out.print("enter the element for["+i +"] ["+j + "]");
	          		num1[i][j]=sc.nextInt();
	      }     
	    }
       System.out.println("\nThe 2D array is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                
                System.out.print(num1[i][j] + " ");
            }
            System.out.println(); 
        }
        
        
        
        int temp=0;
        
        
        System.out.println("\nThe changed 2D array is:");
        
          for(int i=0;i<n/2;i++){  
            temp=num1[i][i];
            num1[i][i]=num1[n-1-i][n-1-i];
            num1[n-1-i][n-1-i]=temp;
            
          }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                
                
                System.out.print(num1[i][j] + " ");
            }
            System.out.println(); 
        }

        
	}

}