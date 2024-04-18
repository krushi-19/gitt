class List9{

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

System.out.print(n.data +"------->");
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
new_node.next=prevnode.next;
prevnode.next=new_node;
}

void append(int new_data){

Node new_node = new Node(new_data);

if(head == null){
head=new_node;
return;

}
new_node.next = null;
Node last = head;
while(last.next != null){

last=last.next;



}
last.next=new_node;
return;




}

void deleteNode(int key){
Node temp =head,prev=null;
if(temp!=null && temp.data == key){
head=temp.next;
return;


}
while(temp!=null && temp.data != key){
prev=temp;
temp=temp.next;

}

if(temp == null)
return;
prev.next=temp.next;







}
void deleteNode(int key){

Node temp=head, prev=null;
if(temp != null && temp.data == key)
{
  
head=temp.next;
return;  
}

while(temp.next != null && temp.data != key){

 temp=temp.next;

}

if(temp == null){

return;
}
prev.next=temp.next;




}

void deleteNode(int pos){
Node temp=head;

if(head == null){

  return;

}
if(pos == 0 ){

head=temp.next;

}
for(int i=0; i<pos-1;temp!=null;i++){

temp=temp.next;


}
if(temp == null && temp.next == null)
return;

Node last = temp.next.next;
temp.next=last;





}





public static void main(String[] args){

List9 l9 = new List9();
l9.head = new Node(10);
Node second = new Node(15);
Node third = new Node(25);

Node forth = new Node(35);

Node fifth = new Node(45);

l9.head.next=second;
second.next=third;
third.next=forth;
forth.next=fifth;
l9.display();
System.out.println();
l9.insert(55);
l9.display();
System.out.println();
l9.insertAfter(second,13);
l9.display();
System.out.println();
l9.append(13);
l9.display();




}






}

