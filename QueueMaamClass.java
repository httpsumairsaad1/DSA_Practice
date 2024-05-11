public class QueueMaamClass {
	
	
	static class Queue
	{
		static int arr[];
		static int size;
		static int rear= -1;
		static int front=-1;
		Queue(int n){
			arr = new int[n];
			this.size = n;
		}
		public static void enqueue( int data )
		{
			if(size== rear)
			{
				System.out.println("Queue is Full");
			}
			else
			{
				++rear;
				arr[rear] = data;
			}
			return;
		}
		public static void dequeue()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty");
				return;
			}
			else
			{
				for (int i = 0; i < rear - 1; i++) {
	                arr[i] = arr[i + 1];
	            }
			}
			rear--;
			front = arr[front]; //elem always remove from front.
		}
		public static int front()
		{
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[front];
		}
		public static boolean isEmpty()
		{
			return rear == front;
		}
		public static boolean isFull() {
			return (rear==size-1);
		}
		public static void display ( )
		{
			int i;
			for( i=0 ; i<arr.length; i++ ) {
				System.out.println("-> "+ arr[i]);
				i++;
				dequeue();
		}
	}
	}
	public static void main ( String [] args)
	{
		Queue q = new Queue(2);
		q.enqueue(10);
		q.enqueue(2);
		q.dequeue();
		q.display();
		
	}
}