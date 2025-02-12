public class Logicalopr
{
	public static void main(String[] args) {
	   int a=25;
	   int b=45;
	   int c=30;
	   if(a>b && a>c){
	       System.out.println("a is greatest");
	   }
	   else if(b>c && b>a){
	       System.out.println("b is greatest");
	   }
	   else{
	       System.out.println("c is greatest");
	   }
	   
	  System.out.println("a is the greatest:" + (a>b & a>c));
	  System.out.println("b is the greatest:" + (b>c & b>a));
	  System.out.println("c is the greatest:" + (c>a & c>b));
	  
	}
}
