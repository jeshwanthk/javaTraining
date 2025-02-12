public class Ternaryopr
{
	public static void main(String[] args) {
	   int a=25;
	   int b=23;
	   int c=58;
	   int max= (a>b & a>c) ? a:(b>c) ? b:c;
	   
	  System.out.println(max);
	}
}
