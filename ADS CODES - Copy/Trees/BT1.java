class BT1 {
    Node root;

  static class Node {
    int data;
    Node left, right;

    Node(int d) {
     data = d;
     left = right = null;
        }
    }

    BT1() {
        root = null;
    }

    BT1(int d) {
        root = new Node(d);
    }

    void printInorder(Node n) {
        if (n == null)
            return;

        printInorder(n.left);
        System.out.print(n.data + " ");
        printInorder(n.right);
    }

    void inorder() {
        printInorder(root);
        System.out.println(); // Add a newline after printing inorder traversal
    }

    void printPreorder(Node n) {
        if (n == null)
            return;

        System.out.print(n.data + " ");
        printPreorder(n.left);
        printPreorder(n.right);
    }

    void preorder() {
        printPreorder(root);
        System.out.println(); // Add a newline after printing preorder traversal
    }

    void printPostorder(Node n) {
        if (n == null)
            return;

        printPostorder(n.left);
        printPostorder(n.right);
        System.out.print(n.data + " ");
    }

    void postorder() {
        printPostorder(root);
        System.out.println(); // Add a newline after printing postorder traversal
    }

    Node insertdata(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key <= root.data)
            root.left = insertdata(root.left, key);
        else
            root.right = insertdata(root.right, key);
        return root;
    }

    void insert(int key) {
        root = insertdata(root, key);
    }

    Node deleteLeaf(Node root, int key) {
        if (root == null) {
            return null; // Node not found or tree is empty
        }

        if (key < root.data) {
            root.left = deleteLeaf(root.left, key);
        } else if (key > root.data) {
            root.right = deleteLeaf(root.right, key);
        } else {

         if(root.left == null)
               return root.right;
          }
          else if(root.right == null)
  
{  
                 return root.left;
            
}

               
        return root;
    }

    void deleteLeafNode(int key) {
        root = deleteLeaf(root, key);
    }

    public static void main(String[] args) {

        BT1 b = new BT1();
        b.root = new Node(5);
        b.root.left = new Node(10);
        b.root.right = new Node(15);
        b.root.right.right = new Node(20);
        System.out.println("Inorder");
        b.inorder();
        System.out.println("Preorder");
        b.preorder();
        System.out.println("Postorder");
        b.postorder();
        b.insert(53);
        b.insert(50);
        b.insert(3);
        System.out.println("Inorder after insertion ------>");
        b.inorder();

        int keyToDelete = 3;
        b.deleteLeafNode(keyToDelete);
        System.out.println("Inorder after deleting node with key " + keyToDelete + " ------>");
        b.inorder();
    }
}
