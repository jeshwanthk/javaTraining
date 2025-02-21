import java.util.*;
public class  Area_Class{
    static double a;
    static Scanner sc =new Scanner(System.in);
    
    	public static void main(String[] args) {
    	 a=sc.nextDouble();
    	 int b;
    	 b=sc.nextInt();
		 Area_Class.area(a);
		 Area_Class.area(a,a);
		 //if we gave return type we have to call like below
		 int Square= Area_Class.area(b);
		 System.out.println("area of square"+Square);
	}
	
	 
  static void area(double a){
    //   int a;
      //float pi=3.14f;
       
       System.out.println("area of circle"+ 3.14*a*a);
   }
   
  static void area(double length,double width){
       System.out.println("area of rectangle"+length*width);
  }
   static int area(int side){
       return side*side;
  }
  
}
