
public class QpracTask {
 
	static class Queue 
	{
		private static int arr[ ];
		private static int size;
		private static int rear = -1; 
		private static int front = -1;
		Queue( int s )
		{
			System.out.print(" Program Start:");
			this.size=s;
			arr = new int[this.size];
		}
		public static boolean add ( int data )
		{
			if ( rear ==  size-1 )
			{
				 System.out.println(" Queue is full.");
				 return false;
			}
			arr[++rear] = data;
			return true;
		}
		public static int remove()
		{
			if( rear==-1 ) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int temp = arr[front+1];
			arr[++front]=0;
			return temp;
				
		}
		
		//display
		public static void display()
		{
			int i;
			System.out.print("\nQueue:    ");
			for( i=0 ; i<arr.length; i++ )
			{
				System.out.print(arr[i]);
				if( i<size-1 ) 
					System.out.print(" -> ");
			}
		}
	}
	public static void main(String[] args)
	{	
		Queue q = new Queue(5);
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.display();
		q.remove();
		q.display();
		System.out.print(q.add(200));;
		
	}

}
