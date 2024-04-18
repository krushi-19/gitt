
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
 head=new_node;
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

void deleteNode(int key){

Node n = head, prev=null;
if(n != null && n.data == key){

head=n.next;

}
while(n != null && n.data != key){
 prev=n;
n=n.next;

}
if(n == null)
return;


prev.next=n.next;


}

public void findMiddleElement(){

if(head == null){

 
  return;

}
Node slow = head;
Node fast = head;
while(fast != null && fast.next != null){

slow= slow.next;
fast = fast.next;




}

System.out.println("Middle element: " + slow.data);



}

public void findNthterm(int n){

  if (head == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

for(int i=0; i<n;i++){

 if(fast == null){

 return;

}
fast = fast.next;


}
while(fast != null){

slow = slow.next;
fast = fast.next;

}

System.out.println("Nth element from end: " + slow.data);



}

public void reverse(){

Node next=null;
Node prev=null;
Node curr=head;

while(curr != null){

next = curr.next;
curr.next=prev;
prev=curr;
curr=next;

}
head = prev;

}

public static singlyLinkedList mergedList = new singlyLinkedList(singlyLinkedList list1,  singlyLinkedList list2){

Node curr1 = list1.head;
node curr2 = list2.head;

while(curr1 !=  null && curr2 != null){

 if(curr1.data < curr2.data){

mergedList.insertAtEnd(curr1.data);
current1 = curr1.next;
}
else{
mergedList.insertAtEnd(curr1.data);
current1 = curr1.next;


}


}
 while (current1 != null) {
            mergedList.insertAtEnd(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.insertAtEnd(current2.data);
            current2 = current2.next;
        }

        return mergedList;
    }




}


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
L1.append(40);
System.out.println();
L1.display();
L1.deleteNode(7);
System.out.println();
L1.display();
L1.findMiddleElement();
L1.display();
L1.findNthterm(3);
L1.display();
L1.reverse();
L1.display();

		
		
		
	
	}
}