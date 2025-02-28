import java.util.*;


public class Strong_Number
{
    public int factorial(int a){
        
        if(a<=1) return 1;
        return a*factorial(a-1);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int temp=0,Strong=0;
		Strong_Number obj=new Strong_Number();
		for(int i=1;i<=val;i++){
		   temp=i;Strong=0;
		while(temp>0){
		    Strong+=obj.factorial(temp%10);
		    temp/=10;
		}
		if(i==Strong){
		    System.out.println(i);
		}
	
		}
		
	}
}
