

public class Simple_interface implements a1
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		 Simple_interface obj=new  Simple_interface();
		
		a1.a1b();
		obj.a2b();
	}
}
interface a1{
    //static int a=10; 
    static void a1b(){
        System.out.print("static method");
    }
    default void a2b(){
        System.out.print("\n"+"default method");
}
// interface a2{
//      int a=20;
//     default void a2b(){
//         System.out.print("\n"+a);
//     }
}