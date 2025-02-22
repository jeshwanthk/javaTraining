import java.util.*;
public class LastNumber
{
	public static void main(String[] args) {
	    int n;
	
		Scanner sc= new Scanner(System.in);
			System.out.println("enter the number of rows:");
			n=sc.nextInt();
			int[] arr1=new int[n];
			int[] arr2=new int[n];
			int[] arr3=new int[n];
			for(int i=0;i<n;i++){
			    arr1[i]=sc.nextInt();
			     arr2[i]=sc.nextInt();
			}
			
			for(int j=0;j<arr1.length;j++){
			    for(int k=0;k<=j;k++)
			    arr3[j]=(int)Math.pow(arr1[j],arr2[k]);
			    arr3[j]=arr3[j]%10;
			    System.out.println(arr3[j]);
			}
	}
}
