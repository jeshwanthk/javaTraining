import java.util.*;

class bubble{
    Scanner sc=new Scanner(System.in);
   
    public void frequency(){
        String str=sc.nextLine();
       
       str= str.trim();
       String str_arr[]=str.split("[,\\s\\.]");
        //for(int i=0;i<str_arr.length;i++){
        //    System.out.println(str_arr[i]);
        //}
         boolean freq[]=new boolean[str_arr.length];
        for(int i=0;i<str_arr.length;i++){
            int count=1;
           
            for(int j=i+1;j<str_arr.length;j++){
                if(str_arr[i].equals(str_arr[j]) && freq[i]==false){
                    count++;
                    freq[j]=true;
                }
                
            }
            if(freq[i]==false) System.out.println(str_arr[i]+" :"+count);
             count=1;
        }
       
    }
}

public class Frequency_Str
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	
		bubble bb=new bubble();
		
	
		bb.frequency();
		
	}
}