class DLL{
	
Node head;

static class Node{
int data;
Node next,prev;
		
Node(int d)
{
data = d;
next = null;
prev = null;
}
}

void insert(int new_data){

Node new_node = new Node(new_data);

new_node.next=head;
new_node.prev=null;
if(head != null){
head.prev=new_node;

}

head=new_node;


}

void insertAfter(Node n, int new_data){
Node new_node = new Node(new_data);
if(n == null)
return;
new_node.next=n.next;
n.next.prev=new_node;
new_node.prev=n;
n.next=new_node;




}

void deleteNode(Node n){

if(head == null || n == null){

 return;

}

if(head == n){
   head=n.next;
   return;

}

if(n.next != null){

   n.next.prev=n.prev;


}

if(n.prev != null){
  n.prev.next=n.next;


}




}


void display(Node n){
Node p = null;
System.out.println("Forward direction:");
while(n != null)
{
System.out.print(n.data+"---> ");
p=n;
n=n.next;
}
		
System.out.println();
System.out.println("Backward direction:");
while(p != null)
{
System.out.print(p.data+"---> ");
p=p.prev;
}
}


void append(int new_data){

Node new_node = new Node(new_data);
Node last = head;
new_node.next = null;

if(head == null){

  head=new_node;
  new_node.prev=null;

}

while(last.next != null){
  last = last.next;


}
last.next=new_node;
new_node.prev=last;



}

	
public static void main(String args[])
{
	DLL d = new DLL();	
d.head = new Node(5);
Node second = new Node(10);
Node third = new Node(15);
Node forth = new Node(20);
Node fifth = new Node(25);

d.head.next=second;
second.next=third;
third.next=forth;
forth.next=fifth;


		
d.display(d.head);
d.insert(44);
System.out.println();


d.insertAfter(second,90);
System.out.println();
d.display(d.head);
d.append(23);
System.out.println();
d.display(d.head);
		



		
		
}
}
	
