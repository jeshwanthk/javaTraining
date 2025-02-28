import java.util.*;

class Functions{
    
    public boolean pronic_num(int a){
        boolean pronic = false;
        for(int i=1;i<a/2;i++){
            if(i*(i+1) == a){
                pronic = true;
            }
        }
        return pronic;
    }
    public boolean abundant_num(int a){
        int count=0;
        boolean abundant=false;
        for(int i=1;i<a;i++){
            if(a%i==0){
                count+=i;
                
            }
        }
        if(count>a){
            abundant=true;
        }
        return abundant;
    }
    
    public boolean digit_sum(int a){
        int sum=0;
        int temp=a;
        boolean niven=false;
        while(a>0){
            sum+=(a%10);
            a/=10;
        }
        if(a%sum==0){
            niven=true;
        }
        return niven;
    }
}
public class Pronic_Niven_Abundant
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    
	    System.out.print("Enter the number to check pronic,abundant,niven: ");
	    int val = input.nextInt();
	    for(int i=1;i<=val;i++){
	        fnc.digit_sum(i);
	        fnc.abundant_num(i);
	        fnc.pronic_num(i);
	        	System.out.println(i+(fnc.digit_sum(i)?":is Niven":"")+(fnc.abundant_num(i)?",Abundant":"")+(fnc.pronic_num(i)?",pronic":""));

	    }
	    
	   // System.out.println(("harshad number:"+fnc.digit_sum(val))+("abundant number"+fnc.abundant_num(val))+("pronic"+fnc.pronic_num(val)));
	}
}