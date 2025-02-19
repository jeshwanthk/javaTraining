import java.util.*;
public class Array2DSorting
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
// 		String input=sc.nextLine();
// 		char[] arr=input.toCharArray();
// 		for(int i=0;i<arr.length;i++){
// 		    System.out.println(arr[i]+" ");
// 		}
// 		int n=sc.nextInt();
// 		int[] num=new int[n];
// 		for(int i=0;i<n;i++){
// 		num[i]=sc.nextInt();
// 		}
		
		int k=sc.nextInt();
		int[][] num1=new int[k][k];
	    for(int i=0;i<k;i++){
	      for(int j=0;j<k;j++){
	          	System.out.print("enter the element for["+i +"] ["+j + "]");
	          		num1[i][j]=sc.nextInt();
	      }     
	    }
       System.out.println("\nThe 2D array is:");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                
                System.out.print(num1[i][j] + " ");
            }
            System.out.println(); 
        }
        
        int[] flatarr=new int[num1.length*num1[0].length];
          int s=0;
	    for(int i=0;i<num1.length;i++){
	       	 for(int j=0;i<num1[i].length;j++){
	       	     flatarr[s++]=num1[i][j];
	       	 }
	    }
	    Arrays.sort(flatarr);
	    
	    for(int i=0;i<num1.length;i++){
	        for(int j=0;i<num1[i].length;j++){
	            num1[i][j]=flatarr[s++];
	    }
	}
	 System.out.println("\nThe 2D array is:");
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[0].length; j++) {
                
                System.out.print(num1[i][j] + " ");
            }
            System.out.println(); 
        }
}
}