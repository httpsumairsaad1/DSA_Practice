class StackPrep
{
	private String []stk;
	private int size;
	static private int top;
	
	public StackPrep( int s){
		this.size =s;
		stk = new String[this.size];
		top=-1;
	}
	
	public boolean isEmpty() {
		if(top==-1)return true;
		return false;
	}
	//PUSH
	public void push( String str ) {
		stk[++top]=str;
	}
	//POP
	public String pop() {
		String temp = stk[top];
		stk[top]="null";
		top--;
		return temp;
	}
	//PEEK
	public String peek() {
		String data = stk[top];
		return data;
	}
	
	//DISPLAY
	public void display ()
	{
		System.out.print("[ ");
		for ( int i=0; i<stk.length; i++ )
		{
			System.out.print(stk[i]+ ", ");
		
		}
		System.out.println(" ]");
	}
	
}
public class StackUsingArray {
	public static void main(String [] args) {
		StackPrep stk = new StackPrep(5); //	size=5
		stk.push("Umair1");
		stk.push("Umair2");
		stk.display();
		System.out.println("peek: "+ stk.peek());
		System.out.println("pop: "+ stk.pop());
		stk.display();
	}
}