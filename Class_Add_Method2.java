import java.util.*;
class Add{
    private int a,b,c;
    public void get(){
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
    }
    public void display(){
        c=a+b;
        System.out.println("Sum = "+c);
    }
}

public class Class_Add_Method2
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Add a=new Add();
		a.get();
		a.display();
	}
}
