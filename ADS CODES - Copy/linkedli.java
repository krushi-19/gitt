class linkedli{


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
   while(n.next != null){
   System.out.print(n.data+ "---> ");
		n=n.next;

}

}
  void insert(int new_data){

  Node new_node = new Node(new_data);
  new_node.next=head;
  head=new_node;

}

void insertAfter(Node prevnode, int new_data){
Node new_node = new Node(new_data);
new_node.next = prevnode.next;
prevnode.next = new_node;
  



}


void insertbefore(Node nextNode, int new_data){

if(head == null){
   System.out.println("List is empty");
    return;

}

  Node new_node = new Node(new_data);
   if(head == nextNode){
     new_node.next=head;
     head=new_node;
    return;

}

Node current = head;
 while (current != null && current.next != nextNode) {
        current = current.next;
    }
if(current == null)
{
   System.out.println("Node not found");
}
else{

new_node.next=current.next;
current.next= new_node;



}


}

void append(int new_data){

 Node new_node = new Node(new_data);
if(head == null)
{

 head = new_node;
 return;

}
new_node.next = null;
Node n = head;
if(n.next != null){
 n = n.next;

}

n.next = new_node;
return;


 

}

void deleteNode(int key){

Node temp = head, prev=null;

if(temp != null && temp.data == key){

     head = new_node;
  return;



}
if(temp != null && temp.data != null){
   pev=temp;
   temp=temp.next;

}
if(temp == null)
 return;



prev.next=temp.next;






}

void deleteNode(int pos){

if(head == null)
 return;

Node temp = head;
if(pos == 0){

 temp=temp.next;
 return;

}

for(int i=0; temp != null;  i<pos-1; i++){

temp = temp.next;

}
if(temp == null && temp.next == null)
 return;

Node last = temp.next.next;
temp.next = last;

}


public static removeduplicate(Node head1){
if(head1 == null && head1.next == null)
return head1;

Node temp = head;
while(temp.next != null){
if(temp.data == temp.next.data){
  temp.next = temp.next.next;

}
else{
 temp = temp.next;

}
return head1;

}

}




public static void main(String[] args){

 linkedli l = new linkedli();
 l.head = new Node(1);
 Node second = new Node(21);
 Node third = new Node(31);
 Node forth = new Node(41);
 Node fifth = new Node(51);
 l.head.next = second;
 second.next = third;
 third.next = forth;
 forth.next = fifth;
 l.display();
 l.insert(80);
 System.out.println();
 l.display();
 l.insertAfter(l.head.next.next, 13);
System.out.println();
 l.display();
 l.insertbefore(l.head.next, 99);
System.out.println();
 l.display();
 l.append(100);
 System.out.println();
 l.display();







}
}