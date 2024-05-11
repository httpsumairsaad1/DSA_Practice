public class DLL
{
	private static ListNode head;
	private static ListNode tail;
	private static int length;
	
	//NODE_CLASS
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode prev;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	//CONTRACTOR
	public DLL() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	//METHODS
	public boolean isEmpty() {
		return length==0;	//	head==null
	}
	public int length() {
		return length;
	}
	
	//BEGIN_INSERT
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			tail = newNode;
		} else {
			head.prev=newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	//LAST_INSERT
		public void insertLast(int value) {
			ListNode newNode = new ListNode(value);
			if(isEmpty()) {
				head = newNode;
			} else {
				tail.next=newNode;
			}
			newNode.prev = tail;
			tail = newNode;
			length++;
		}
	
	//DISPLAY_FORWARD
	public static void  displayForward() {
		if(head==null) {
			return;
		}
		ListNode temp=head;
		while ( temp != null ) {
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	//DISPLAY_BACKWARD
	public static void  displayBackward() {
		if(head==null) {
			return;
		}
		ListNode temp=tail;
		while ( temp != null ) {
		System.out.print(temp.data+" --> ");
		temp=temp.prev;
		}
		System.out.print("null");
	}
	public static void main ( String [] args ) {
		DLL dll = new DLL();
		dll.insertLast(2);
		dll.insertFirst(1);
		dll.insertLast(4);
		dll.insertLast(6);
		dll.displayBackward();
		System.out.println("\n [ Length : "+dll.length()+" ]");
		dll.displayForward();
	}
}
