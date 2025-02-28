import java.util.*;


public class Sorted_Array
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
	   
	   int left=0,right=matrix.length-1;
	   
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            int num=matrix[i][j];
	            for(int k=0;k<n;k++){
	                for(int l=0;l<m;l++){
	                    int num2=matrix[k][l];
	                    if(num2 > num){
	                        temp=matrix[i][j];
	                        matrix[i][j]=matrix[k][l];
	                        matrix[k][l]=temp;
	                    }
	                }
	            }
	    
	        }
	    }
	    
	    System.out.println("sorted array");
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	    System.out.print(matrix[i][j]+" ");
	        }
	        System.out.println();
	    }

	}
}