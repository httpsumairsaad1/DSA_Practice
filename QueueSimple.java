
public class QueueSimple
{

	public static void main(String[] args)
	{
		Queue q = new Queue(9);
		q.add(1);
		q.add(10);
		q.add(20);
		q.add(320);
		q.add(443);
		//-------
		q.add(107);
		q.add(740);
		q.add(83);
		System.out.println("peek element: "+q.peek());
		q.add(861);
		while(!q.isEmpty()) {
			System.out.print(" -> " + q.peek());
			q.remove();
		}
		
	}

}
class Queue
{
	static int arr[];
	static int size;
	static int rear= -1;
	
	Queue( int n )
	{
		arr = new int[n];
		this.size = n ;
	}
	public static boolean isEmpty()
	{
		return rear == -1;
	}
	public static boolean isFull()
	{
		return (rear==size-1);
	}
	//enqueue.
	public static void add( int data )
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		rear++;
		arr[rear]= data;
	}
	//dequeue-remove--- O(n) because of Array
		public static int remove() 
		{
				if(isEmpty())
				{
					System.out.println("Queue is Empty");
					return -1;
				}
				int front = arr[0]; //elem always remove from front.
				
				for(int i=0; i<rear; i++)
				{
					arr[i]=arr[i+1];
				}
				rear--; //shifted all element previous place.
				return front;
		}
	//peek
		//peek--- O(n) because of Array
				public static int peek()
				{
					if(isEmpty()) {
						System.out.println("Queue is Empty");
						return -1;
					}
					return arr[0];
				}
}
