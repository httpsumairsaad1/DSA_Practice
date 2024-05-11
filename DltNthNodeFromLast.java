//import SinglyLinkedList.ListNode;

public class DltNthNodeFromLast 
{
	private static ListNode head;
	//ListNode - class.
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
	
	//method
	public ListNode removeNthNodeFromLast(ListNode head, int n)
	{
		if(head.next == null) {		//condition of OneNode.
			return null;
		}
		int size=0;
		ListNode cur=head;
		while(cur!=null)		//finding-size of LL.
		{
			cur = cur.next;
			size++;
		}
		
		//deleting head node.
		if(n == size)
		{
			return head.next;
		}
			
		//prevNode of RequiredNode
		int indexToSearch = size - n;	
		ListNode prev = head;
		int i=1;
		while(i<indexToSearch)
		{
			prev = prev.next;
			i++;
		}
		prev.next=prev.next.next;
		return head; 
	}
	
	public void display() {
		ListNode cur = head;
		while(cur!=null) {
			System.out.print (cur.data + " ---> ");
			cur=cur.next;
		}
		System.out.print("null");
	}
	//main method
	public static void main(String[] args) 
	{
		DltNthNodeFromLast sll = new DltNthNodeFromLast();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode five = new ListNode(50);
		
		//connecting - node
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = five;
		sll.display();
		int location=2;		//		1<=location<=5
		sll.removeNthNodeFromLast(head,location);		//deletingNthNode from last.
		System.out.println();
		sll.display();
		
	}

}
