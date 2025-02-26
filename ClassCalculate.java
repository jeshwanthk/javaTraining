
public class ClassCalculate
{
    int a=5;
     void display(){
        System.out.println(a);
    }
     void display(int a,int b){
        System.out.println("addiition:"+(a+b));
    }
    void display(double a,int b){
        System.out.println("subtraction:"+(a-b));
    }
    double display(double a,double b){
        return a/b;
    }
    double display(int a,double b){
        return a*b;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		ClassCalculate obj=new ClassCalculate();
		obj.display();
		obj.display(5,10);
		obj.display(40.0,10);
		System.out.println(obj.display(10.0,2.0));
		System.out.println(obj.display(10,2.0));
	}
}