
public class DeleteNodeAllOperations {
	private Node head;
	private static class Node
	{
		private int data;
		private Node next;
		Node( int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	//Insert at the begin.
	public void insertFirst(int value ) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	//display.
	public void display() {
		Node cur = head;
		while(cur!=null) {
			System.out.print(cur.data + "->");
			cur = cur.next;
		}
		System.out.print("null");
	}
	//delete First
	public void deleteFirst() {
		Node temp = head;
		head = head.next;
		temp.next = null;
	}
	//delete Last
	public Node deleteLast() {
		if( head == null || head.next == null ) {
			return head;
		}
		Node cur = head;
		Node prev = null;
		while(cur.next!=null) {
			prev = cur;
			cur= cur.next;
		}
		prev.next = null;	//breaking chain
		return cur;
		
	}
	//delete given position.
	public static void main(String[] args) {
		DeleteNodeAllOperations ll = new DeleteNodeAllOperations();
		ll.insertFirst(11);
		ll.insertFirst(55);
		ll.insertFirst(11);
		ll.insertFirst(55);
		ll.display();
		System.out.print("\nDelete First: ");	
		ll.deleteFirst();
		ll.display();
		System.out.println("\nDelete Last: "+ ll.deleteLast().data);
		ll.display();
	}
}
