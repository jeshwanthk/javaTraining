import java.util.Scanner;

public class Circularprime {

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        
        return true; 

    }
    public int findLength(int a) {
        int count = 0;
        while (a > 0) {
            count++;
            a = a / 10;
        }
        return count;
    }

    
    public int rotate(int a) {
        int len = findLength(a); 
        int rotatedNum = 0;
        
        
        rotatedNum = (a % 10) * (int) Math.pow(10, len - 1) + (a / 10);
        
        return rotatedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        
        Circularprime obj = new Circularprime();
        //int length=obj.findLength(num);
        boolean allPrime = true;
        int originalNum = num;
        
        
        int length = obj.findLength(num); 
        
        for (int i = 0; i < length; i++) {
       
            
            if (!obj.isPrime(num)) {
                allPrime = false;
                break; 
            }
            
            num = obj.rotate(num); 
            System.out.println((num) + ((obj.isPrime(num)) ? "isa prime" : "is mnot prime"));
        }

        
        
            System.out.println(originalNum + ((allPrime)?"isa prime":"is not a circularprime"));
        
    }
}
