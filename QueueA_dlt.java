

//working perfectly at gdb online.
public class QueueA_dlt
{
	
	//Queue all method defined in the Queue Class.
	static class Queue 
	{
		private  static String str[];
		private  static int size;
		private  static int rear=-1;
		private  static int front=0; 
		
		public Queue(int s)
		{
			this.size = s;
			str = new String[size];
		}
		
		//enqueue 
		public  static boolean add( String data)
		{
			if(rear==size-1)
			{
				//System.out.print("\nQueue is Full");
				return false;
			}
			else 
			{
				str[++rear]=data;
				return true;
			}
		}
		
		//dequeue
		public  static String remove()
		{
			if( rear == -1)
			{
				System.out.print("Queue is Empty");
				return " ";
			}
			else
			{
				String temp = str[front];
				str[front]="NULL";
				++front;
				return temp;
			}
		}
		
		//peek
		public static String peek()
		{
			return str[front];
		}
		
		//middle of the queue
		public static String middle()
		{
			if((rear-front>1))
				return str[(front+rear)/2];
			else
				return "not possible";
		}
		
		public static String removeAforEver(String cur)
		{
			int strlen = cur.length();
			char[] ch = new char[strlen+1];
			for( int i=0; i<strlen; i++)
			{
				ch[i] = cur.charAt(i);
				if( ch[i]=='A' || ch[i]=='a')
					ch[i]=' ';
			}
			String str = new String(ch);
			return str;
		}
		//display
		public static void display()
		{
			int i;
			System.out.print("\nQueue:    ");
			for( i=0 ; i<str.length; i++ )
			{
				String s = Queue.removeAforEver(str[i]);
				System.out.print(s);
					if( i<size-1 ) 
						System.out.print(" -> ");
			}
		}
	}
	
	public static void main(String args[])
	{
		Queue q = new Queue(5);
		q.add("umair1");
		q.add("umair2");
		q.add("umair3");
		q.add("umair4");
		q.add("umair5");
		q.display();
		System.out.print("\n\nMiddle of the Queue: "+ q.middle());
		System.out.print("\nDequeue: "+ q.remove());
		System.out.print("\nDequeue: "+ q.remove());
	//	System.out.print("\nDequeue: "+ q.remove());
		q.display();
		System.out.println("\nMiddle of the Queue: "+ q.middle());
		q.display();
	}

}