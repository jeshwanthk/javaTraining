import java.util.*;

public class Palindrome_count
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the string: ");
		String str=sc.nextLine();
		char str1[]=str.toCharArray();
		int n=str1.length-1,count=0;
		for(int i=0;i<str1.length/2;i++){
		    if(str1[n-i]==str1[i]){
		        continue;}
		        else{
		    count++;
		    str1[n-i]=str1[i];
		        }
		}
		 System.out.println("correct palindrome: ");
		for(int j=0;j<str1.length;j++){
		   
		    System.out.print(str1[j]);
		    
		}
		 System.out.print("\ncount:"+count);
	}
}




