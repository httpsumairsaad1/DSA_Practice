public class BegNode_SLL {
	private ListNode head;
	private static class ListNode
	{
		private int data;
		private ListNode next;
		ListNode( int data )
		{
			this.data = data;
			this.next = null;
		}
	}
	//Insert at the begin.
	public void insertFirst(int value ) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	//Insert at the last
	public void insertLast( int value )
	{
		ListNode newNode = new ListNode(value);
		if(head==null) {
			newNode = head;
			return;
		}
		ListNode cur = head; 
		while(cur.next!=null) {
			cur=cur.next;
		}
		cur.next = newNode;
	}
	//Display.
	public void display()
	{
		ListNode cur = head;
		while(cur!=null) {
			System.out.print(cur.data + "-> ");
			cur=cur.next;			
		}
		System.out.print("null");
	}
	public static void main(String[] args) {
		BegNode_SLL sll = new BegNode_SLL();
		sll.insertFirst(100);
		sll.insertFirst(18);
		sll.display();
		System.out.println();
		sll.insertLast(18);
		sll.insertLast(100);
		sll.display();
	}

}
