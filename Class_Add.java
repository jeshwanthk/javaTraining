import java.util.*;
class Add{
    private int a,b,c;
    public void sum(){
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum = "+c);
    }
}

public class Class_Add
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Add a=new Add();
		a.sum();
	}
}
