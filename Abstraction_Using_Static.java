import java.util.*;

abstract class Circle{
    static double area,perimeter,r;
   
     //static void calc_area();
     static double get(){
         Scanner sc=new Scanner(System.in);
          System.out.println("Enter the radius");
         r=sc.nextDouble();
         return r;
     }
    
    static void calc_area(){
        
        area=3.14*r*r;
     System.out.println("Area="+area);
    }
    static void calc_peri(){
        perimeter=2*3.14*r;
  System.out.println("permiter="+perimeter);
  
    }
    
}
// class Area extends Circle{
//  private double r;
//  public Area(){
//      Scanner in=new Scanner(System.in);
//      r=in.nextDouble();
//  }
//  void calc_area(){
//      area=3.14*r*r;
//      System.out.println("Area="+area);
//  }
// }

public class Abstraction
{
	public static void main(String[] args) {
	 Circle.get();   
    Circle.calc_area();
    Circle.calc_peri();
	}
}
