class BT8{

Node root;
 
static class Node(){
int data;
Node left, right;

Node(int d){
data=d;
left=right=null;


}


}

BT8(){
		root = null;
	}
	BT8(int d){
		root = new Node(d);
	}

void inorder(Node n){

if(n == null)
 return;


printInorder(n.left);
System.out.println(n.data + " " );
printInorder(n.right);


}

void inorder(){

printInorder(root);

}

Noded insertdata(Node root, int key){

if(root == null){

root = new Node(key)
return root;

}

if(key <= root.data){

 root.left = insertdata(root.left,key);



}

else(key >= root.data){

 root.right = insertdata(root.right,key);



}
reutn root;



}



void insertdata(int key){

root = insertdata(root,key)

}



public static void main(String[] args){

BT8 b = new BT8();
b.root = new Node(20);
b.root.left = new Node(25);
b.root.right = new Node(56);
b.root.right.right = new Node(12);
b.inorder();
System.out.println("Inorder---->");
System.out.println();






}

}