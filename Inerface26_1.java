interface interface1{
    static void stat(){
        
    }
    default void defau(){
        
    }
    abstract void abstra();
       
}

interface interface2 extends interface1{
    static void stat(){
        System.out.println("static method in interface2");
    }
    default void defau(){
        System.out.println("default method in interface2");
    }
    abstract void abstra();
    // {
    //     System.out.println("Abstract method in interface2 after overriding");
    // }
}
public class Inerface26_1 implements interface2
{
    public void abstra(){
        System.out.println("Abstract method in MAin method after overriding");
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
	interface2.stat();
	Inerface26_1 obj=new Inerface26_1();
	obj.defau();
	obj.abstra();
	}
}