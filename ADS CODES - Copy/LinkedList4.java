public class LinkedList4{


Node head;
static class Node{
int data;
Node next;

Node(int d){

 data=d;
 next = null;

}
}

void display(){

Node n = head;
while (n != null) {
            System.out.print(n.data + "------>");
            n = n.next;
        }


}

public void insert(int new_data)
{
  Node new_node = new Node(new_data);
  new_node.next=head;
  return new_node;

}

public void insertAfter(Node prevnode, int new_data){
Node new_node = new Node(new_data);
new_node.next= prevnode.next;
prevnode.next = new_node;


}

public void append(int new_data){
Node new_node = new Node(new_data);


if(head == null){

head=new_node;
return;

  }

Node last = head;
while(last.next != null){

 last = last.next;
}
last.next = new_node;
return;




}

public void deleteNode(int key){
 Node temp = head, prev=null
 if(temp != null && temp.data == key){

  head=temp.next;
return;

}

while(temp != null && temp.data != key){

prev=temp;
temp=temp.next;

}
if(temp == null)
 return;
prev.next=temp.next;



}








public static void main(String[] args){

LinkedList4 l4 = new LinkedList4();
l4.head= new Node(10);
 Node second=new Node(20);
 Node third=new Node(30);

l4.head.next=second;
second.next=third;

l4.display();
System.out.println();
l4.insert(33);
l4.display();
System.out.println();

l4.insertAfter(second,69);
l4.display();
System.out.println();

l4.append(30);
l4.display();
System.out.println();

l4.deleteNode(20);
System.out.println();
l4.display();





}





}
