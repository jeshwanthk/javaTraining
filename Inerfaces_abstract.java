abstract class outerclass {
    
    abstract void abstra();
    
    void nonabstract(){
        System.out.println("Outerclass non abstract method");
    }
    
    abstract class innerclass{
        
        abstract void innerabstra();
    
    void innernonabstract(){
        System.out.println("Outerclass non abstract method");
    }
    }
    
}

       

class normal2 extends outerclass{
    public void abstra(){
        System.out.println("outerclass  abstract method");
    }
    class normal extends innerclass {
    public void innerabstra(){
        System.out.println("innerclass  abstract method");
    }
}
}

public class Inerfaces_abstract extends normal2
{
    
	public static void main(String[] args) {
		System.out.println("Hello World");
	normal2 obj=new normal2();
	obj.abstra();
	obj.nonabstract();
	normal2.normal obj1=obj .new normal();
	obj1.innerabstra();
    obj1.innernonabstract();
	}
}