import java.util.*;

    
    class Student{
        String name;
        int regno;
        void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name= sc.nextLine();
        System.out.println("Enter the regno:");
         regno=sc.nextInt();
        }
        void display(){
            System.out.println("Name:"+name+" Regno :"+regno);
            
        }
        }
        
    
    public class Students_Method
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
// 		Student s1=new Student();
// 		s1.get();
//    
    	for(int i=0;i<5;i++){
    	
		Student s2=new Student();
		s2.get();
    	s2.display();
    	}
	}

}