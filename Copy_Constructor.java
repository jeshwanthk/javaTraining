import java.util.*;

public class Copy_Constructor
{
	public static void main(String[] args) {
 
  Rectangle rec=new Rectangle(100.0,101.0);
  rec.display();
  Rectangle rc=new Rectangle(rec);
  rc.display();
  Rectangle b=new Rectangle();
  b.display();
  
  
	}
}
class Rectangle {
    
   double length,width;
   
   Rectangle(){
      length=0.0;
      width=0.0;
   }
   
  Rectangle(double length,double width){
      this.length=length;
      this.width=width;
   }
   Rectangle(Rectangle r){
     this.length=r.length;
      this.width=r.width;
   }
   void display(){
       System.out.println("length:" +length+"\n width:"+width);
   }

}


