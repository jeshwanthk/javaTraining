import java.util.*;

abstract class BankAccount{
    private Double balance;
    static Double interest;
    private int accountnumber;
    static int interestrate,year;
    private String account;
    
    
    
    public BankAccount(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the balance");
    balance=sc.nextDouble();
     System.out.println("enter the accountnumber");
    accountnumber=sc.nextInt();
    System.out.println("enter the InterestRate:");
    interestrate=sc.nextInt();
    System.out.println("enter the Duration(in years):");
    year=sc.nextInt();
    
    
    }
    
    public double get_balance(){
        return balance;
    }
    
    
    
    abstract double calculateinterest();
       
     void display(){
         System.out.println("Accountnumber:"+ accountnumber +"\nbalance"+balance+"\ninterest:"+interest);
          
          System.out.println(" ");
     }  
    
}
class savingsaccount extends BankAccount{
     savingsaccount(){
    super();
     }
    public double calculateinterest(){
    //  account=="savingsaccount";
     interest=super.get_balance()*year*(interestrate*10)/100;
     return interest;
    }
}
class currentaccount extends BankAccount{
    currentaccount(){
    super();
    }
     double calculateinterest(){
    //  account=="savingsaccount";
     interest=super.get_balance()*year*(interestrate*5)/100;
     return interest;
    }
    
}


public class BankAccount_Abstraction
{
	public static void main(String[] args) {
	 savingsaccount s=new savingsaccount();
	 s.calculateinterest();
	 s.display();
	 currentaccount c=new currentaccount();
	 c.calculateinterest();
	 c.display();
	}
}
