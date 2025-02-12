import java.util.*;
public class Prime2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number");
        // int num=sc.nextInt();
        
        for (int number = 1; number <= 100; number++) {
            boolean isPrime = true;
            
            
            if (number <= 1) {
                isPrime = false;
            } else {
                
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
