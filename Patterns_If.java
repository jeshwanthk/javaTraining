public class  Patterns_If{
   
    	public static void main(String[] args) {
		 Patterns_If.pattern.print();
	}
	 

static class pattern{
    static int n=5;
    static void print(){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(j==1||j==3||j==5)
            {
                System.out.print("*");
            }
            if(j==2||j==4){
                 System.out.print("#");
            }
        }
        System.out.println();
    }
}

}
}