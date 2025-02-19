import java.util.*;
public class Transpose2D
{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int row=0,col=0,curr=0,prev=0;
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] num1=new int[r][c];
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
        int n= num1.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=num1[i][j];
                num1[i][j]=num1[j][i];
                num1[j][i]=temp;
            }
        }
       
       System.out.println("\nThe changed 2D array is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                
                System.out.print(num1[i][j] + " ");
            }
            System.out.println(); 
        }
        
}
}