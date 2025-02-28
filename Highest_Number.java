import java.util.*;


public class Highest_Number
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int first=0,second=0,third=0;
	    int n=sc.nextInt();
	    int m=sc.nextInt();
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
	            
                if (num == first || num == second || num == third) {
                    continue;
                }
	            
	     if(first == 0||first<num){
	         
	         third=second;
	         second=first;
	         first=num;
	         
	     }
	     else if(second==0||second<num){
	         
	         third=second;
	         second=num;
	         
	         
	     }
	     else if(third==0||third<num){
	         
	         third=num;
	         
	         
	     }
	    
	        }
	    }
	    System.out.println("Third Highest number is:"+((third!=0)?third:first));
	            

	}
}