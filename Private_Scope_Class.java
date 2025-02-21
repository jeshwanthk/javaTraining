import java.util.*;
class Add{
    private int a,b,c;
    
    private void get(){
        //private method cannot directly accessed in another class
        	Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
    }
    public void toget(){
        //get method is called here bcoz it has private access
        get();
    }
    
    public void display(){
         //get();
         //optimized code to get access of get method
        System.out.println("Value of A:"+a);
        System.out.println("Value of B:"+b);
        System.out.println("Value of C:"+c);
    }
}

class Private_Scope_Class{

	public static void main(String[] args) {
		System.out.println("Hello World");
			Add n=new Add();
		 
          n.toget();
          n.display();

	}}

