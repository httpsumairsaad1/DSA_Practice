class St
{		
		int size;
		St( int s )
		{
			this.size = s;
		}
		int []stk= new int [100];
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
		public int pop()
		{
			--top;
			int a = stk[top];
			stk[top]=0;
			return a;
		}
		public void push( int data)
		{
			stk[top]= data;
			top++;
		}
		public  char peek ( )
		{
			char data = (char) stk[top-1];
			return data;
		}
		//-------------------------------------------
		public static void main(String[] args)
		{
			String exp = "6+(2-3)";
			St stk =  new St(exp.length());
			System.out.println(exp.length());
			for ( int i =0 ; i<exp.length(); i++)
			{
				if( exp.charAt(i)=='+' || exp.charAt(i)=='-' | exp.charAt(i)=='(')
				{
					stk.push(exp.charAt(i));
				}
				else if(exp.charAt(i)==')')
				{
					System.out.print((char)stk.pop());
					stk.peek();
				}
				else
				{
					System.out.print(exp.charAt(i));
				}
				if(i==exp.length()-1)
				{
					System.out.print((char)stk.pop());
				}
			}
			System.out.println((char)stk.pop());
		}
}
