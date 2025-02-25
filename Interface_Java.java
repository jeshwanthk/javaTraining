

public class Interface_Java implements SBI,INDIAN,CUB
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	  Main obj=new Main();
	  obj.bank();
	  obj.c();
	}
		public void bank(){
		    
		    System.out.println("banks in india");
		}
		public void c(){
		    
		    System.out.println("\n Customers");
		}	
}

interface SBI{
    void bank();
    void c();
}
interface INDIAN{
    void bank();
}
interface CUB{
    void bank();
}