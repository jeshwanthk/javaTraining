import java.util.*;

public class Object_Car
{
	public static void main(String[] args) {


		// Scanner input = new Scanner(System.in);
		// int n = input.nextInt();
		
		//bk.Book();
       Car cr=new Car();
       //cr.SetBrand();
	}
}
class Car {
    String brand;
    Car(){
         brand="unknown";
        SetBrand();
    }
  
   void SetBrand(){
       System.out.println(brand);
       Scanner sc=new Scanner(System.in);
       String UserBrand=sc.nextLine();
       brand=UserBrand;
       System.out.println("brand entered is:"+ brand);
   }

}


