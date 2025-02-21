import java.util.*;
class Calculator{
    public int a,b,c,Sub;
   Scanner sc=new Scanner(System.in);
   //scanner defined as public and accessed in methods
    public void sum(){
       
        int sum1=sc.nextInt();
        int sum2=sc.nextInt();
        
         System.out.println("Sum of A and B:"+" "+(sum1+sum2));
    }
    public int sub(){
        
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        Sub=sub1-sub2;
        return Sub;
    }
    public void prod(int a,int b){
        c=a*b;
        System.out.println("product:"+c);
    }
    public int div(int a,int b){
        c=a/b;
        return c;
    }
    
    
}

class Calculator_Methods{

	public static void main(String[] args) {

        
		  Calculator n=new Calculator();
		  n.sum();
          
          int subtraction=n.sub();
          //we can assign value to a variable and can give as output
          System.out.println("subtraction"+subtraction);
          
           Scanner sc=new Scanner(System.in);
           int prod1=sc.nextInt();
           int prod2=sc.nextInt();
           n.prod(prod1,prod2);
          
          //int divresult=n.div(12,2);
          //we can directly give the value in print method using object 
          System.out.println("division:"+n.div(12,2));
	}}

