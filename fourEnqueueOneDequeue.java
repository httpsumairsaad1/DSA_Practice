import java.util.*;
public class fourEnqueueOneDequeue
{
	static class Queue
	{
		static int arr[];
		static int size;
		static int rear= -1;
		
		Queue( int n )
		{
			arr = new int[n];
			this.size = n;
		}
		public static boolean isEmpty()
		{
			return rear == -1;
		}
		public static boolean isFull()
		{
			return (rear==size-1);
		}
		
		//------------Enqueue-------------
		public static void enqueue( int data )
		{
			if(isFull()) {
				System.out.println("Queue is Full");
			}
			rear++;
			arr[rear]= data;
		}
		
		//------------Dequeue-------------
		public static int dequeue()
		{
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int front=arr[0];
			
			for( int i=0; i<rear; i++)
			{
				arr[i]=arr[i+1];
			}
			rear--;
			return front;	
				
		}
		public static int peek()
		{
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[0];
		}
		public static void display ( )
		{
			int i;
			for( i=0 ; i<arr.length; i++ ) {
				System.out.print("-> "+ arr[i]);
				i++;
			}
		}
	} 
	public static void main(String[] args)
	{
		Queue q	= new Queue(9);
		int [] nums = {5,10,15,20,25,30,2,54,66};
		
		for( int i=0; i<nums.length; i++)
		{
				q.enqueue(nums[i]);
				if( i==3 || i==7 )
				{
					q.dequeue();
				}
		}
		q.display();
	}
}

