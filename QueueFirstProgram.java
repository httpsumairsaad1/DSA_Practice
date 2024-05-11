
public class QueueFirstProgram {
	static class Queue 
	{
		static int arr[];
		static int size;
		static int rear= -1;
		
		Queue(int n){
			arr = new int[n];
			this.size = n;
		}
		public static boolean isEmpty()
		{
			return rear == -1;
		}
		public static boolean isFull() {
			return (rear==size-1);
		}
		//enqueue-add--- O(1) because of Array
		public static void add( int data )
		{
			if(isFull())
			{
				System.out.println("Queue is Full");
			}
			rear++;
			arr[rear] = data;
		}
		
		//dequeue-remove--- O(n) because of Array
		public static int remove() {
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
	
	public static void main(String[] args) {
		Queue q = new Queue(9);
		q.add(10);
		q.add(100);
		q.add(20);
		q.add(30);
		q.add(44);
		//-------
		q.add(10);
		q.add(770);
		q.add(3);
		q.add(81);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
