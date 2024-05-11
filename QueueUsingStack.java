import java.util.Stack;
public class QueueUsingStack 
{
	//QUEUE_CLASS
	static class Queue
	{
		static Stack<Integer> s1 = new Stack<Integer>();
		static Stack<Integer> s2 = new Stack<Integer>();
		
		//ADD
		static void enQueue( int data ) {
			
			//Move all elements from s1 from s2.
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(data);
			
			//push everything back to s1.
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		
		//REMOVE
		static int deQueue() {
			if(s1.isEmpty()) {
				System.out.println("Q is Empty");
				System.exit(0);
			}
			
			//return top of s1.
			return s1.pop();
		}
	};
	
	//DRIVER_CLASS
	public static void main(String[] args) 
	{
		Queue q = new Queue();
		q.enQueue(2);
		q.enQueue(4);
		q.enQueue(6);
		
		System.out.print("DeQueue: "+q.deQueue() + " ");
	    System.out.print(q.deQueue()+ " ");
	    System.out.print(q.deQueue());
	}

}
