
class Linkedlist1{
	
Node head;
static class Node{
		
int data;
Node next;
		
Node(int d)
{
data=d;
next=null;
}
}
	
void display()
{
Node n = head;
while(n!= null)
{
System.out.print(n.data+ "---> ");
n=n.next;
}
}

void insert(int new_data){

Node new_node = new Node(new_data);
new_node.next=head;
head=new_node;

}

void insertAfter( Node prevnode,int new_data){
Node new_node = new Node(new_data);
new_node.next= prevnode.next;
prevnode.next=new_node;



}


void append(int new_data){


Node new_node = new Node(new_data);
if(head == null){
 head=new_data;
return;
}

new_node.next=null;
Node n = head;
while(n.next != null){

 n = n.next;



}
n.next=new_node;
return;





}



	
public static void main(String args[]){
		
Linkedlist1 L1 = new Linkedlist1();
L1.head = new Node(5);
Node second = new Node(7);
Node third = new Node(9);
L1.head.next = second;
second.next = third;
		
L1.display();
L1.insert(10);
System.out.println();
L1.display();

L1.insertAfter(second,20);
System.out.println();
L1.display();
L1.display();
L1.insert(40);
System.out.println();
L1.display();
		
		
		
	
	}
}