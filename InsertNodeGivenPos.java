//insert Node given position and delete first node.

import java.util.Scanner;

public class InsertNodeGivenPos {
	public static int size=0;
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
	
	// insert node given position.
	public void insert( int value, int position)
	{
		size++;
		ListNode newNode = new ListNode(value);
		if(position == 1) {
			newNode.next = head;
			head = newNode;
		}
		else
		{
			ListNode prev = head; 		//transV
			int count = 1;
			while(count<position-1) {
				prev=prev.next; 
				count++;
			}
			ListNode cur = prev.next;
			prev.next=newNode;
			newNode.next= cur;
		}
	}
	
	public boolean isEmpty() {
		return (head==null);
	}

	//Display.
	public void display()
	{
		ListNode cur = head;
		while(cur!=null) {
			System.out.print(cur.data + "-> ");
			cur=cur.next;			
		}
		System.out.println("null");
	}
	
	public static int size() {
		return size++;
	}
	
	public int search(int i)
	{
		for( int j=0; j<size; j++)
		{
			if(isEmpty())
				return -1;
			int idx=1 ;
			ListNode temp = head;
			while(temp!=null)
			{
				if( temp.data==i )	
				{
					return idx;
				}
				idx++;
				temp=temp.next;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		InsertNodeGivenPos sll = new InsertNodeGivenPos();
		sll.insertFirst(80); 
		sll.insertFirst(79);
		sll.insertFirst(78);
		sll.insertFirst(44);
		sll.insertFirst(25);
		sll.insertFirst(15);
		sll.insertFirst(12);
		sll.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Node Given Position:\nEnter pos:");
		int pos = sc.nextInt();
		System.out.println("Enter the Value:");
		int value = sc.nextInt();
		sll.insert(value,pos);
		sll.display();
		System.out.println("25 found at: "+sll.search(25));
		
	}

}
