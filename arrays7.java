import java.util.*;
public class arrays7 {
    public static void main(String[] args) {
       
    // //   int arr[] ={1,1,1,0,0,1,0,0,1,1,0};
    // Scanner sc=new Scanner(System.in);
    // int s= sc.nextInt();
    // int[] arr=new int[s];
    
 String a = "999888777666555444333222111";
        String b = "999888777666555444333222111";
    
    
         char[] arr1=a.toCharArray();
         char[] arr2=b.toCharArray();

        int maxlength = Math.max(arr1.length,arr2.length);
        char[] result=new char[maxlength+1];
        
        int carry=0;
        
        int i=arr1.length-1;
        int j=arr1.length-1;
        int k=result.length-1;

      while(i>=0 || j>=0 || carry!=0)
      {
          int digita= (i>=0) ? arr1[i]-'0':0;
          int digitb= (j>=0) ? arr2[j]-'0':0;   
          
          int sum=digita+digitb+carry;
          carry = sum/10;
          result[k]=(char)(sum%10+'0');
          i--;
          j--;
          k--;
          
      }
      String output=new String(result);
      
      System.out.println(output);
      }
}
