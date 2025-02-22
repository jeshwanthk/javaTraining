class base{
    private void privat(){
        System.out.println("private");
    }
    public void publi(){
        System.out.println("public");
    }
    protected void protect(){
        System.out.println("protected");
    }
     void defau(){
        System.out.println("default");
    }
}

class derived extends base{
    //private has change to default
     void privat(){
        System.out.println(" over ride private");
    }
    public void publi(){
        //public cannot change its scope
        
        System.out.println("over ride public");
    }
    public void protect(){
        //protected has changed to public
        System.out.println("over ride protected");
    }
     protected void defau(){
         //default has change to protected
        System.out.println("over ride default");
    }
}

public class Scope_Overiding1 {
    public static void main(String[] args) {
       System.out.println("overriden methods:");
       
      derived s1=new derived();
      s1.privat();
      s1.publi();
      s1.protect();
      s1.defau();
    }
}
