class BT{

Node root;

 static class Node{
  int data;
   Node left,right;

   	Node(int d){

         data = d;
         left=right=null;

}


}
BT(){
		root = null;
	}
	BT(int d){
		root = new Node(d);
	}


 void printInorder(Node n)
 {
	if(n == null)
		return;
	
	printInorder(n.left);
	System.out.print(n.data + " ");
	printInorder(n.right);
 }
 
 void inorder()
 {
	 printInorder(root);
 }


int depth(Node node){
  if(n == null)
   return 0;
  else{
  int ld = depth(n.left);
 int rd = depth(n.right);
 if(ld > rd)
    return(ld+1);
else
   return(rd+1);



}


}


  public static void main(String[] args){

   BT b = new BT();
   b.root = new Node(5);
   b.root.left = new Node(11);
   b.root.left.left = new Node(15);
  b.root.right = new Node(19);
 b.root.right.right = new Node(19);
System.out.println("Inorder---->");
b.inorder();
		
   

   


}



}
