
class Node{
    int data;
    Node next;
    
    public Node(int val){
        data=val;
        next=null;
    }
}

class LinkedList{
    Node head;
    
    public LinkedList(){
        head=null;
    }


public void append(int val){
    Node newnode=new Node(val);
    
    if(head==null){
        head=newnode;
        return;
    }
    
    Node current=head;
    while(current.next!=null){
        current=current.next;
    }
        current.next=newnode;
}

public void display(){
    if(head==null){
        System.out.println("List is empty");
    }
    
        Node current=head;
        while(current!=null){
          System.out.println(current.data+" ");
          current=current.next;
        
        
    }
}
public void delete(int data){
    if(head == null){
        System.out.println("List is empty");
        return;
    }
    if(head.data==data){
        head=head.next;
        return;
    }
    
    Node current=head;
    while(current.next!=null){
        if(current.next.data==data){
            current.next=current.next.next;
            return;
        }
        current=current.next;
    }
    System.out.println("Node with value " + data + " not found!");
}
}

public class LinkedListExample{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.append(10);
        list.append(20);
        list.append(120);list.append(40);
        list.append(30);
        System.out.println("linkedlist");
        list.display();
        list.delete(30);
        System.out.println("rearranged linkedlist");
        list.display();
    }
}