
public class RabbitTurtleMidNode {
	public RabbitTurtleMidNode()
	{
		System.out.println("***Program Develop by Umair Saad***\n"
				+ "Program Start:");
	}
	
	public static int s=0;
	private ListNode head;
	private static class ListNode
	{
		private int data;
		private ListNode next;
		public ListNode( int data )
		{
			this.data = data;
			this.next = null;
			s++;
		}
		//size
		public static int size()
		{
			return s;
		}
	}
	
	//insertFirst
	public void insertFirst(int value)
	{
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head=newNode;
	}
	public String evenOdd(int num)
	{
		return (num%2==0)?"even":"odd";
	}
	
	//middleNode
	public ListNode middleNode()
	{
		ListNode rabbit = head;
		ListNode turtle = head;
		while( rabbit != null && rabbit.next != null )
		{
			turtle = turtle.next;
			rabbit = rabbit.next.next;
		}
		return turtle;
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
	public static void main(String[] args) {
		RabbitTurtleMidNode ll= new RabbitTurtleMidNode();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(30);
		ll.insertFirst(40);
		ll.insertFirst(50);
		ll.display();
		System.out.println ( 
				ListNode.size() + " " +ll.evenOdd(ListNode.size()) + " Nodes");
		System.out.println("Middle Node: "+ll.middleNode().data);
	}

}
