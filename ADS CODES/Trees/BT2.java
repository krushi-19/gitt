class BT2{

Node root;

static class Node{
 int data;
 Node left,right;

Node(int d){
 data = d;
left=right=null;
 

}



}

BT2(){

root = null;

}

BT2(int d){

root = new Node(d);

}


void printInorder(Node n){

if(n == null)
  return;

  printInorder(n.left);
  System.out.print(n.data + " " );
  printInorder(n.right);




}


void inorder(){

printInorder(root);

}


void printPreorder(Node n){

if(n == null)
  return;

 
  System.out.print(n.data + " " );
 printPreorder(n.left);
  printPreorder(n.right);




}


void preorder(){

printPreorder(root);

}
void printPostorder(Node n){

if(n == null)
  return;

 
 
 printPostorder(n.left);
  printPostorder(n.right);
 System.out.print(n.data + " " );




}


void postorder(){

printPostorder(root);

}


Node insertdata(Node root, int key){

 if(root == null){

   root = new Node(key);
   return root;
  
}


if(key <= root.data)
		root.left = insertdata(root.left,key);
	else
		root.right = insertdata(root.right, key);
	return root;


}


void insert(int key){

root = insertdata(root, key);

}



 private Node Searchdata(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return Searchdata(root.left, key);
        } else {
            return Searchdata(root.right, key);
        }
    }






 Node search(int key) {
        return Searchdata(root, key);
    }


Node deleteKey(Node root, int key){

if(root == null)
 return;
if(key < root.data)
root.left = deletedata(root.left,key);
else if(key > root.data)
root.right = deletedata(root.right, key);
else{

if(root.left == null)
return root.right;
if(root.right == null)	
return root.left;


}

root.data = minvalue(root.right);
root.right = deleteKey(root.right,root.data);



}


int minvalue(Node root){

  int x = root.data;
   while(root.left != null){
  int x = root.left.data;
   root = root.left;

}
 return x;


}




void delete(int key){

root = deleteKey(root, key);

}




public static void main(String[] args){

BT2 b2 = new BT2();
b2.root= new Node(10);
b2.root.left = new Node(25);
b2.root.right = new Node(56);
b2.root.right.right = new Node(12);
System.out.println("Inorder------->");
b2.inorder();
System.out.println("");

System.out.println("Preorder------->");
b2.preorder();
System.out.println("");

System.out.println("Potorder------->");
b2.postorder();
System.out.println();
b2.insert(83);
b2.inorder();
Node result = b2.search(56);
if(result !=  null){

 System.out.println("Node with key 56 found in the tree.");


}
else{
  System.out.println("Node with key 56 not found in the tree.");

}







}



}