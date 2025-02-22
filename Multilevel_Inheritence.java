class supermost{
    private int a =10;
    private void  supermethod(){
        System.out.println("private number from supermost: "+a);
       
    }
    public void showprivate(){
        supermethod();
    }
}
class supers extends supermost{
    
    protected int b=15;
    protected void superclass(){
         System.out.println("protected number from superclass: "+b);
    }
}

class child extends supers{
       int c=20;
      void childclass(){
          System.out.println("default number from child class: "+c);
      }
      public void display(){
           showprivate();
          superclass();
          System.out.println("superclass  member accessed in child:"+b);
          childclass();
      }
}

public class Multilevel_Inheritence {
    public static void main(String[] args) {
       System.out.println("Multilevel Inheritence");
       
      child sc=new child();
      sc.display();
    }
}
