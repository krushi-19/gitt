public class List{

Node head;

static class Node{
int data;
Node next;

Node(int d){
data=d;
next=null;

}
}

void display(){
Node n = head;
while(n != null){
  System.out.print(n.data+ "-----> ");
  n=n.next;

}



}

public void insert(int new_data){
Node new_node = new Node(new_data);
new_node.next=head;
head=new_node;

}

public void insertAfter(Node prevnode, int new_data){
Node new_node = new Node(new_data);
new_node.next=prevnode.next;
prevnode.next=new_node;




}

void append(int new_data)
{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = new_node;
			return;
		}
		new_node.next = null;//condition for last node in the list
	
	Node last = head;//traverse ke liya new reference create kiya hai
	//last.next: last node tak le jayega
	while(last.next != null)
	{
		last = last.next;// shifting to next node
	}
	last.next = new_node;// connect to new node
	return;
}









public static void main(String[] args){

List l1 = new List();
l1.head = new Node(5);
Node second = new Node(10);
Node third = new Node(15);
Node forth = new Node(20);
Node fifth = new Node(25);

l1.head.next=second;
second.next=third;
third.next=forth;
forth.next= fifth;

l1.display();
System.out.println();
l1.insert(17);
l1.display();
System.out.println();
l1.insertAfter(forth,22);
l1.display();
System.out.println();
l1.append(20);
l1.display();






}






}
