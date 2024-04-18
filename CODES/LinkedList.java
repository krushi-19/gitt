public class LinkedList
{
	Node head;//starting point of list
	
	static class  Node{
		int data;//data value
		Node next;//link for node
		
		Node(int d)//constructor for default values
		{
			data = d;
			next = null;
		}

	}
	
	public void display()
	{
		Node n = head;
		
		while(n != null)
		{
		System.out.print(n.data+"----> ");
		n=n.next;// traversing next node
		}
		
	}

      public void insert(int new_data) {
        Node new_node = new Node(new_data); // Create a new node with the new data
        new_node.next = head; // Point the new node to the current head of the list
        head = new_node; // Update the head to be the new node
    }
	
  public void insertAtBetween( Node prevNode, int new_data){   
    Node new_node = new Node(new_data);
    new_node.next = prevNode.next; // Point the new node to the next node of the previous node
    prevNode.next = new_node; // Update the next reference of the previous node to the new node
}

	public static void main(String args[])
	{
		LinkedList l1 = new LinkedList();
		
		l1.head = new  Node(11);// linkedlist with first node is created
		Node first = new Node(22);
		Node second = new Node(33);
		
		l1.head.next = first;// next node 22 is connected
		first.next = second;//next node 33 is connect
		
		              l1.insert(44);
                   l1.insertAtBetween(first, 55);
              l1.display();


		
		
	}
}