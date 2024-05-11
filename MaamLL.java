public class MaamLL {
	
	
	Node head ;
	static class Node
	{
		int data;
		Node next;
		Node( int d)
		{
			data = d;
			next = null;
		}
	}
	public static void main( String [] args)
	{
		MaamLL llist = new MaamLL();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		
		llist.head.next = second;
		second.next= third;
		third.next = fourth;
		fourth.next = five;
		five.next = six;

	}
}
