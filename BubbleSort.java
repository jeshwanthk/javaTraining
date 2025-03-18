import java.util.*;

class bubble{
    public void bubble_sort(int arr[]){
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("After bubble sort : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class BubbleSort
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),arr[]=new int[n];
		bubble bb=new bubble();
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		bb.bubble_sort(arr);
		
	}
}