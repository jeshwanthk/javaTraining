
public class loops6
{
	public static void main(String[] args) {
	    int n=7;
	for (int i = 1; i <= n; i++){
	    for(int j=i;j<n;j++){
	       
	        System.out.print(" ");
	    }
	      System.out.print("*");
	   for(int k=1;k<=(2*i-3);k++){
	       
	       System.out.print("0");
	   }
	     
	     if(i!=1){
	     System.out.print("*");
	     }
	     
	   System.out.println();
	}
	for(int i=1;i<n*2;i++)
	{
	    System.out.print("*");
	}
	}
}
