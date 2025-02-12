import java.util.*;
public class Prime
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the number:");
	   int number=sc.nextInt();
	   int count=0;
	   
	   for(int i=2; i< Math.sqrt(number);i++){
	       if(number%i ==0){
	           count++;}}
	           
	           if(count==0){
	           System.out.println("number is  prime:");
	       }
	       else{
	           System.out.println("not a prime number");
	       }
	}
	}

