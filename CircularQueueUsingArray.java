//import CircularQueueUsingArray.Queue;

public class CircularQueueUsingArray {
	static class Queue 
	{
		static int arr[];
		static int size;
		static int rear= -1;
		static int front = -1;
		 
		Queue(int n){
			arr = new int[n];
			this.size = n;
		}
		public static boolean isEmpty()
		{
			return (rear == -1 && front==-1);
		}
		public static boolean isFull() {
			return (rear+1)%size==front;
		}
		//enqueue-add--- O(1) because of Array
		public static void add( int data )
		{
			if(isFull())
			{
				System.out.println("Queue is Full");
			}
			if(front == -1)		//1st element add.
			{
				front = 0;
			}
			rear = (rear+1)%size;
			arr[rear] = data;
		}
		
		//dequeue-remove--- O(1) because of Array
		public static int remove() {
			if(isEmpty())
			{
				System.out.println("Queue is Empty");
				return -1;
			}
			int result = arr[front]; //element always remove from front.
			
			if(rear == front) //single element condition.
			{
				rear = front = -1;
			} else {
				front = (front+1)%size; 	//when front is on last index.
			}
			return result;
		}
		
		//peek--- O(1) because of Array
		public static int peek()
		{
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[front];
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.add(1);
		q.add(2);
		System.out.println("removing front: "+q.remove());
		q.add(3); 
		q.add(4);
		System.out.println("removing front: "+q.remove());
		q.add(5);
		q.add(6);
		q.add(7);
		//diagram example: pageNo#43 in GreenBook.
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
