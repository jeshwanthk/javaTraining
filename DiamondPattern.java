/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

/**
 *
 * @author user
 */
public class DiamondPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int n=9;
        int s=5;
        int i,j;
//        for(i=0;i<=n;i++){
//            for( j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//            
for(i=1;i<=9;i++){
    System.out.print("*");
}
System.out.println();
        
          for( i=1;i<s;i++){
            for(j=0;j<s-i;j++,System.out.print("*")){
                
            }
            for( j=1;j<=2*i-1;j++,System.out.print(" ")){
                
            }
            for(j=s+i;j<=n;j++,System.out.print("*")){
                
            }
            System.out.println();
        }
          
          for( i=2;i<s;i++){
            for(j=1;j<=i;j++,System.out.print("*")){
                
            }
            for( j=n-1-i;j>=i;j--,System.out.print(" ")){
                
            }
            for(j=1;j<=i;j++,System.out.print("*")){
                
            }
            System.out.println();
        }
          for(i=1;i<=9;i++){
    System.out.print("*");
}
    }
    
}


