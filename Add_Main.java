import java.util.*;
class Add_Main{
    public int a,b,c;
    
    
    public void display(){
        
        System.out.println("Value of A:"+a);
        System.out.println("Value of B:"+b);
        System.out.println("Value of C:"+c);
    }



	public static void main(String[] args) {
		System.out.println("Hello World");
			Add n=new Add();
		Scanner sc=new Scanner(System.in);
        n.a=sc.nextInt();
        n.b=sc.nextInt();
        n.c=n.a+n.b;
        
	
		
		n.display();

	}}

