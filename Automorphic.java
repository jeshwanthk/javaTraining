import java.util.Scanner;

public class Automorphic {
    
    public void automorph() {
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Enter the range: ");
        long range = s.nextInt(); 
        
       
        for (long i = 1; i <= range; i++) {
            long temp = i;
            long multiple = temp * temp; 
            
            
            int numDigits = (int) Math.log10(temp) + 1;
            
            
            long modulus = (long) Math.pow(10, numDigits); 
            
            if (multiple % modulus == temp) {
                
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Automorphic obj = new Automorphic();
        obj.automorph();
    }
}
