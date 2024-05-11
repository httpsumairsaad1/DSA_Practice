public class QueueUsingLL {
	
	//NodeClass
	static class Node{
		int data;
		Node next;
		public Node(int d){
			this.data=d;
			next = null;
		}
	}
	
	//QueueClass
	static class Queue{
		static Node head = null;
		static Node tail = null;
		
		//IS_EMPTY
		public static boolean isEmpty() {
			return head == null && tail == null;
		}
		
		//ADD_ELEMENT
		public static void add(int d) {
			Node newNode = new Node(d);
			
			//1st element add
			if(tail == null) {
				tail = head = newNode;
				return;
			}
			//enqueue from rear.
			tail.next = newNode;
			tail = newNode;
		}
		
		//REMOVE_ELEMENT
		public static int remove(){
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int front = head.data;
			
			//singleElements
			if(head==tail)
				tail=null;
			
			//two or more elements
			head = head.next;
			
			return front;
		}
		
		//PEEK
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			return head.data;
		}
		
		//print
		public static void print(Queue q){
			while(!q.isEmpty()) {
				System.out.print(""+q.peek());
				q.remove();
			}
		}
	}
	public static void main(String [] args){
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		//print
		q.print(q);
	}
}
