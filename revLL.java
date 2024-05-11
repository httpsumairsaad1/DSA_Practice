import java.util.*;

//import SinglyLinkedList.ListNode;

public class revLL {
	
	public static ListNode head;
	public static ListNode next;
	
	private static class ListNode
	{
		private int data;
		private revLL.ListNode next;
		ListNode( int d )
		{
			this.data = d;
			this.next = null;
		}
	}
	
	private static void rev()
	{
		ListNode curr = head;
		ListNode prev = null;
		ListNode forw = null;
		while(curr!=null) {
			forw=curr.next;
			curr.next = prev;
			prev=curr;
			curr= forw;
		}
	}
	
	//display
	public static void display() {
		ListNode cur = head;
		while(cur!=null) {
			System.out.print (cur.data + " ---> ");
			cur=cur.next;
		}
		System.out.print("null");
	}
	
	//add
	public void insertFirst( int value)
	{
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	//----------------------
	public static void main( String []args)
	{
		revLL link = new revLL();
		
		link.insertFirst(65);
		link.insertFirst(95);
		link.insertFirst(6);
		//rev();
		display();
		System.out.println("Reverse: ");
		rev();
		display();
	}
}
