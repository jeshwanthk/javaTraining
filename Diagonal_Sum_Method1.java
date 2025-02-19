import java.util.*;

public class Diagonal_Sum_Method1
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Row & Cloumn Size of Matrix : ");
		int r=input.nextInt(), c=input.nextInt(), arr[][] = new int[r][c];
		int i,j;
		int sum=0;
		int sumright=0;
		int n=arr.length;
		for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        arr[i][j]=input.nextInt();
		    }
		}
		System.out.println("the array is:");
			for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        
		        System.out.print(" "+arr[i][j]+" ");
		    }
		    System.out.println(" ");
		}
		
		for(i=1;i<r;i++){
		    
		
		    sum+=arr[i][0];
		
			}
			sum+=arr[2][1];
			System.out.println("the changed array is:");
			arr[0][0]=sum;
			
			for(int k=1;k<n;k++){
			    sumright+=arr[0][k];
			}
			sumright+=arr[1][2];
			arr[n-1][n-1]=sumright;
			
	 for(i=0;i<r;i++){
		    for(j=0;j<c;j++){
		        
		        System.out.print(" "+arr[i][j]+" ");
		    }
		    System.out.println(" ");
		}
	
	
	}
	}

