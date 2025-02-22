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
    private void privat(){
        System.out.println(" over ride private");
    }
    public void publi(){
        System.out.println("over ride public");
    }
    protected void protect(){
        System.out.println("over ride protected");
    }
     void defau(){
        System.out.println("over ride default");
    }
}

public class Scope_Overiding {
    public static void main(String[] args) {
       System.out.println("overriden methods:");
       
      base s1=new derived();
      //s1.privat();
      s1.publi();
      s1.protect();
      s1.defau();
    }
}
