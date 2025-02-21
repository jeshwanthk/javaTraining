import java.util.*;

class LeftAngleTriangle{
    
   Scanner sc=new Scanner(System.in);
   public void Leftri(){
   System.out.println("enter the number of rows:");
   int n=sc.nextInt();
    System.out.println("LeftAngleTriangle:");
   for(int i=0;i<n;i++){
       for(int j=n;j>i;j--){
       System.out.print(" ");
       }
       for(int k=0;k<=i;k++){
           System.out.print("*");
       }
        System.out.println();
   }

   }
}
class RightAngleTriangle{
    
   Scanner sc=new Scanner(System.in);
   public void Rigtri(){
   System.out.println("enter the number of rows:");
   int n=sc.nextInt();
    System.out.println("RightAngleTriangle:");
   for(int i=0;i<n;i++){
       for(int j=n;j<0;j--){
       System.out.print(" ");
       }
       for(int k=0;k<=i;k++){
           System.out.print("*");
       }
        System.out.println();
   }

   }
}



class Triangle_Classes{

	public static void main(String[] args) {

        
		LeftAngleTriangle rig=new LeftAngleTriangle();
		rig.Leftri();
		RightAngleTriangle lef=new RightAngleTriangle();
		 lef.Rigtri();
	}}

