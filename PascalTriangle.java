public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5; 
        
       
        for (int i = 0; i < rows; i++) {
            int value = 1;  
            
            
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);  
            }
            
            System.out.println();  
        }
    }
}
