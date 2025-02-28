import java.util.*;


public class Matrix_Diagonal_Swap
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   // int first=0,second=0,third=0;
	   int temp=0;
	    int n=sc.nextInt(),m=sc.nextInt();
	     
	    int matrix[][]=new int[n][m];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            matrix[i][j]=sc.nextInt();
	        }
	       
	    }
	    int length=matrix.length;
	  for(int i=0;i<n;i++){
	        for(int j=0;j<i;j++){
	            matrix[i][j]=matrix[j][i];
	        }
	  }
	    
	    System.out.println("Changed array");
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	    System.out.print(matrix[i][j]+" ");
	        }
	        System.out.println();
	    }
	    
	    

	}
}