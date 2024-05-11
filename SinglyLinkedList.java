
public class SinglyLinkedList {
	
	private ListNode head;
	private static class ListNode
	{
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public void display() {
		ListNode cur = head;
		while(cur!=null) {
			System.out.print (cur.data + " ---> ");
			cur=cur.next;
		}
		System.out.print("null");
	}
	public void insertFirst( int value)
	{
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	public ListNode deleteFirst() {
		if(head==null) {
			return null;
		}
		ListNode temp=head;
		head = head.next;	 //head-move;
		return temp;
	}
	public static void main(String[] args) {
		SinglyLinkedList sll= new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(45);
		ListNode fourth = new ListNode(13);
		
		//now, we will connect together tp form a chain.
		sll.head.next = second;		//10->1
		second.next = third;		//10->1->45
		third.next = fourth;		//10->1->45->13->null
		
		//insertFirst
		sll.insertFirst(99);
		sll.insertFirst(18);
		//deleteFirst()
		sll.deleteFirst();	
		//display
		sll.display();
		System.out.println("\n"+sll.deleteFirst().data);
		sll.display();
	}

}
