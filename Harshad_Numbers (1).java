import java.util.*;
public class Harshad_Numbers
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int num=0,sum=0,originalnum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting Range:");
		int start=sc.nextInt();
		
		System.out.println("Enter the Ending Range:");
        int end=sc.nextInt();
			System.out.println("Harshad Numbers:");
		for(int i=start;i<=end;i++){
		     num=i;
		     sum=0;
		     originalnum=num;
		    while(num>0){
		        sum+=num%10;
		        num/=10;
		    }
		    if(originalnum%sum==0) System.out.println(originalnum);
		    
		}
	}
}