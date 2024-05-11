
public class QueueFunc {
	
	static class Queue
	{
		private static int arr[];
		private static int size;
		private static int rear=-1, front=-1;
		private static int loc;
		public Queue(int s)
		{
			this.size = s;
			arr = new int[this.size];
		}
		public static void enqueue( int data)
		{
			if(rear==arr.length)
			{
				System.out.println("Queue is Full ");
			}
			if(front==-1 && rear==0) {
				front++;
			}
			rear++;
			arr[rear]=data;
		}
		public static int dequeue()
		{ 
				if(rear==arr.length)
				{
					System.out.println("Queue is Empty");
					return -1;
				}
			loc = arr[front];
			arr[front]=0;
			front++;
			return loc;
		}
		public static int peek()
		{
			if(rear==-1) {
				System.out.println("Queue is Empty");
			}
			return arr[front];
		}
		public static void display() {
			for( int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]);
				if(i!=arr.length-1) {
					System.out.print(" --> ");
				}
					
			}
			System.out.println();
		}
	}
	public static void main ( String [] args)
	{
		Queue q = new Queue(10);
		Queue.enqueue(1);
		Queue.enqueue(2);
		Queue.enqueue(3);
		Queue.enqueue(4);
		Queue.enqueue(5);
		Queue.display();
		System.out.println("removed: "+Queue.dequeue());
		Queue.display();
		System.out.println("removed: "+Queue.dequeue());
		Queue.display();
		System.out.println("removed: "+Queue.dequeue());
		Queue.display();
		System.out.println("peek: "+Queue.peek());
		Queue.enqueue(6);
		Queue.enqueue(7);
		Queue.enqueue(8);
		Queue.enqueue(9);
		Queue.enqueue(10);
		Queue.display();
		System.out.println("removed: "+Queue.dequeue());
		System.out.println("removed: "+Queue.dequeue());
		System.out.println("removed: "+Queue.dequeue());
		System.out.println("removed: "+Queue.dequeue());
		System.out.println("removed: "+Queue.dequeue());
		System.out.println("removed: "+Queue.dequeue());
		Queue.display();
		Queue.dequeue();
		Queue.display();
		
		
	}
}
