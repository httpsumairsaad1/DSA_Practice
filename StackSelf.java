public class StackSelf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk = new Stack();
		stk.push(39);
		stk.push(55);
		stk.push(432);
		stk.push(123);
		stk.display();
		System.out.println(stk.search(39));
		
		System.out.println("pop: "+stk.pop());
		stk.display();
		System.out.println("peek "+ stk.peek());
		stk.display();
		System.out.print(stk.isEmp());
		
	}
}
class Stack 
{  
	int []stk= new int [5];
	private int top = 0;
	public boolean isEmp( )
	{
		if ( stk.length==0) {
			return true;
		}
		return false;
	}
	public void display ()
	{
		System.out.print("[ ");
		for ( int i=0; i<stk.length; i++ )
		{
			System.out.print(stk[i]+ ", ");
		
		}
		System.out.println(" ]");
	}
	public void push( int data)
	{
		stk[top]= data;
		top++;
	}
	public int pop()
	{
		top--;
		int a= stk[top];
		stk[top]=0;
		return a;
	}
	public boolean search( int s )
	{
		for ( int i=0; i<stk.length; i++) {
			if(s==stk[i]) {
				return true;
			} 
		}
		return false;
	}
	public int peek ( )
	{
		int data = stk[top-1];
		return data;
	}
}