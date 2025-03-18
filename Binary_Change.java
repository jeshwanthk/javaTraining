import java.util.*;

class bubble{
    Scanner sc=new Scanner(System.in);
    
    public void Binary(){
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Enter positions to Swap(i, j): ");
        int i = sc.nextInt(), j = sc.nextInt();
        String binary = String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0");
        StringBuilder val = new StringBuilder(binary);
        val.replace(i, i+1,binary.substring(j,j+1));
        val.replace(j, j+1,binary.substring(i,i+1));
        System.out.println(val);
        int num=Integer.parseInt(val.toString(),2);
        System.out.println(num);

       
        }
        
    
    
   
}

public class Binary_Change
{
	public static void main(String[] args) {
		
	
		bubble bb=new bubble();
		
	
		
		bb.Binary();
	}
}