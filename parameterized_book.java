import java.util.*;

public class parameterized_book
{
	public static void main(String[] args) {
 
  Book book=new Book("Salaar","Prabhas",200.0);
  book.display();
   Book bk=new Book(book);
  bk.display();
  Book b=new Book();
  b.display();
	}
}
class Book {
    
   String title;
   String Aurthor;
   Double price;
   
   Book(){
       title="unknown";
       Aurthor="obito";
       price=0.0;
   }
   
   Book(String title,String Aurthor,Double price){
       this.title=title;
       this.Aurthor=Aurthor;
       this.price=price;
   }
   Book(Book r){
   this.title=r.title;
       this.Aurthor=r.Aurthor;
       this.price=r.price;
   }
   void display(){
       System.out.println(" Title of the book:"+title+" \n author: "+Aurthor+"\n price:"+price);
   }

}


