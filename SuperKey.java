class supermost{
     int a;
    void method(){
        a=10;
    }
     void display(){
        System.out.println("superclass memebersss:"+a);
    }
}
class sub extends supermost{
    
    int a;
    void  method(){
      super.method();
       a=100;
    }
      void display(){
         
        System.out.println("subclass memeber:"+a);
         System.out.println("superclass memeber:"+super.a);
         super.display();
    }
}
public class SuperKey{
    public static void main(String[] args) {
       System.out.println("Super Keyword");
       
      supermost sc=new sub();
      sc.method();
      sc.display();
    }
}
