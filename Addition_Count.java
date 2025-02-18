import java .util.*;

public class Addition_Count
{
	public static void main(String[] args) {
	    
	   // Scanner input = new Scanner(System.in);
	    int n=9,count=0;
	   int[] input={2,6,5,4,3,7};
	   for(int i=0;i<input.length;i++){
	       for(int j=i+1;j<input.length;j++){
	          if(i<j){
	           if(input[i]+input[j]==n){
	              System.out.println(i+" "+j);
	               count++;
	           }
	           }
	       }
	   }
	   	       System.out.println(count);

	}
}