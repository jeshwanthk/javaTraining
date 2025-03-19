import java.util.*;

class Functions{
    
    public int[][] get_inputs(int n){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
    
    public void spiral_display(int[][] arr,int n){
        int rs=0,cs=0,re=n-1,ce=n-1;
        while(rs<=re || cs<=ce){
            if(rs<=re){
                for(int i=cs;i<=ce;i++) System.out.print(arr[rs][i]+" ");
                rs++;
            }
            
            if(cs<=ce){
                for(int j=rs;j<=re;j++) System.out.print(arr[j][ce]+" ");
                ce--;
            }
            
 
            if(rs<=re){
                for(int i=ce;i>=cs;i--) System.out.print(arr[re][i]+" ");
                re--;
            }
            
            if(cs<=ce){
                for(int j=re;j>=rs;j--) System.out.print(arr[j][cs]+" ");
                cs++;
            }
    }
    }
     public void rightrotate(int[][] arr,int n){
        int[][] r_arr=new int[n][n];
        int i,j,rc;
        for( i=0,rc=n-1;i<n;i++,rc--) for(j=0;j<n;j++) r_arr[j][rc] = arr[i][j];
        System.out.println();
        display(r_arr,n);
    } 
    public void leftrotate(int[][] arr,int n){
        int[][] l_arr=new int[n][n];
        int i,j,rc;
        for( i=0,rc=n-1;i<n;i++,rc--) for(j=0;j<n;j++)  l_arr[i][j]=arr[j][rc];
        System.out.println();
        display(l_arr,n);
    } 
    

    public void display(int[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


public class Matrix
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    Functions fnc = new Functions();
	    System.out.println("enter the number of rows and colums:");
	    int n = input.nextInt();
	    System.out.println("entered the elements:");
	    int[][] arr = fnc.get_inputs(n);
	    System.out.println("\nArray you entered:");
	    fnc.display(arr,n);
	    
	    System.out.println("\nSpiral Ordered: ");
	    fnc.spiral_display(arr,n);
	     System.out.println();
	    System.out.println("\nRightRotated Array:");
	    fnc.rightrotate(arr,n);
	    
	    System.out.println("\nLeftRotated Array:");
	    fnc.leftrotate(arr,n);
	}
}