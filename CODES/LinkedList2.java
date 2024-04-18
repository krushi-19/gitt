public class Linkedlist2{

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
 while(n != null)
		{
		System.out.print(n.data+"----> ");
		n=n.next;// traversing next node
		}

}

public void insert(int new_data){

   Node new_node = new Node(new_data);
   new_node.next=head;
   head=new_node;

}

public void insertAfter(Node prev_node, int new_data){

Node new_node = new Node(new_data);
new_node.next=prev_node.next;
prev_node.next = new_node;

}

public void append(int new_data){

Node new_node = new Node(new_data);
if(head == null){

 new_node=head;
  return;
 

}

 new_node.next = null;
 Node last = head;
 while(last.next != null){
  last = last.next;

}
 last.next = new_node;
 return;





}









public static void main(String[] args){

 Linkedlist2 list2 = new Linkedlist2();
 list2.head = new Node(20);
 Node second = new Node(30);
 Node third = new Node(40);
list2.head.next = second;
second.next = third;
 list2.insert(35);
list2.insertAfter(list2.head.next,55);
list2.display();

				
 System.out.println();
list2.append(40);
		System.out.println();
		list2.display();
		


}
}
