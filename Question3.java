
public class Question3 {
	static class Stack 
	{  
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
	}
	public class InfixToPostfix
	{
		public static int prec ( char c)
		{
			switch(c)
			{
			case'+':
			case'-':
				return 1;
			case'^':
				return 3;
			case'*':
			case'/':
			}
			return 2;
		}
		
		//chechking digit or character in the stack
		private static boolean isCharacterOrDigit( char c)
		{
			if( (c>=97 && c<=122) || (c>=65 && c<=90) || (c>=48 && c<=57) )
					return true;
				return false;
		}
		
		public static String inxToPost( String exp )
		{
			String res = new String (" ");
			Stack stk= new Stack();
			for( int i =0 ; i<exp.length(); i++)
			{
				
				char ch= exp.charAt(i);
				if( isCharacterOrDigit(ch) )
				{
					res +=ch;
				}
				if( '('==ch )
				{
					stk.push(ch);
				}
				else if(')'==ch)	//  closed bracket ? pop until find the '(' or open bracket. 
				{
					while(!stk.isEmp() 
								&& stk.peek() != '(')
					{
						res += stk.peek();	
						stk.pop();	//pop until find the '(' or open bracket.
					}
					stk.pop(); //this pop only for '(' bracket if exist.
				}
				else
				{
					while(!stk.isEmp()
							&& prec(ch) <= prec(stk.peek()))
					{
						res += stk.peek();
						stk.pop();
					}
					stk.push(ch);
				}
			}
			//corner-case for invalid input.
			while (!stk.isEmp()) {
	            if (stk.peek() == '(')
	                return "Invalid Expression";
	            res += stk.peek();
	            stk.pop();
	        }
			return res;
		}
	} // end infix to post class
	
	public static void main(String[] args) {
		String exp = "6+(2-3)";
		System.out.println("Infix: "+exp);
		
		System.out.println("Postfix: "+InfixToPostfix.inxToPost(exp));
	}

}
