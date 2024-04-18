public class LinkedList6{
	
Node head;//instance
static class Node{
		
int data;
Node next;
		
Node(int d)
{
data=d;
next=null;
}
}

void display(){

Node n = head;
while(n.next != null){

 System.out.print(n.data+"--------->");
  n=n.next;


}


}

void insert(int new_data){

Node new_node = new Node(new_data);
new_node.next=head;
head=new_node;


}

void insertAfter(Node prevnode,int new_data){

Node new_node = new Node(new_data);
new_node.next = prevnode.next;
prevnode.next = new_node;


}

void append(int new_data){

Node new_node = new Node(new_data);
  if(head == null){
   head=head.next;
    return;

}
 new_node.next=null;
 Node last = head;
while(last.next!=null){

last=last.next;


}
last.next = new_node;





}




	
	

	
public static void main(String args[]){
		
LinkedList6 L1 = new LinkedList6();
L1.head = new Node(5);
Node second = new Node(10);
Node third = new Node(15);
Node forth = new Node(20);
Node fifth = new Node(25);

L1.head.next=second;
second.next=third;
third.next=forth;
forth.next=fifth;


		
L1.display();
L1.insert(44);
System.out.println();


L1.insertAfter(second,90);
System.out.println();
L1.display();
L1.append(23);
System.out.println();
L1.display();
		






		                
	
	}
}