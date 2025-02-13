
public class numbers
{
	public static void main(String[] args) {
	int number=123456;
	int rem=0;
	int res=0;
	int even=0;
	while(number>0){
	    rem=number%10;
	    number=number/10;
	    if(rem%2 !=0)
	      res=res*10+rem;
	      
	      else
	      even=even*10+rem;
	       
	}

	System.out.println(res +" "+ even);
	}
}
