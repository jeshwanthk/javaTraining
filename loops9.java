
public class loops9
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
	for(int i=n-1;i >=1;i--){
	    for(int j=n;j>i;j--){
	        System.out.print(" ");
	        
	    }
	    System.out.print("*");
	    
	    for(int k=1;k<=(i*2-3);k++){
	        System.out.print("0");
	    }
	    if(i!=1)
	    System.out.println("*");
	}
	 
	     
	
	System.out.println();
	
	}
}


  