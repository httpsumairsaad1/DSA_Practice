public class StackSimple
{
	public static void main(String[] args)
	{
		Stackk stk =  new Stackk();
		stk.psh(39);
		stk.psh(45);
		stk.psh(234);
		stk.display( );
		//-------------------
		System.out.println("pop: "+stk.pop());
		stk.display();
		System.out.println("peek "+ stk.peek());
		stk.display();
		System.out.print("is empty? "+stk.isEmp());
	}
}
class Stackk
{
	int stk[] = new int [5];
	private int top = 0 ;
	public boolean isEmp()
	{
		if(stk.length==0)
			return true;
		return false;
	}
	public void display()
	{
		System.out.print("[ ");
		for ( int i=0; i<stk.length; i++ )
		{
			System.out.print(stk[i]+ ", ");
		
		}
		System.out.println(" ]");
	}
	public int siz ( )
	{
		return top;
	}
	public void psh ( int data  )
	{
		if(siz()==5)
		{
			System.out.println("Stack is full!!!");
		}
		stk[top]= data;
		top++;
	}
	public int pop()
	{
		--top;
		int a = stk[top];
		stk[top]=0;
		return a;
	}
	public int peek()
	{
		int data = stk[top-1];
		return data;
	}
}