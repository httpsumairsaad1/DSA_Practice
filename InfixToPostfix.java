import java.util.Stack;

public class InfixToPostfix 
{	
	public static int prec( char c )
	{
		switch(c)
		{
		case '+':
		case '-':
			return 1;
			
		case '*':
		case '/':
			return 2;
			
		case '^':
			return 3;
		}
		return -1;
	}
	private static boolean isCharacterOrDigit( char c)
	{
		if( (c>=97 && c<=122) || (c>=65 && c<=90) || (c>=48 && c<=57) )
			return true;
			return false;
	}
	public static String inxToPost( String exp )
	{
		String result = new String(" ");
		
		Stack<Character> stk = new Stack<Character>();
		 
		for( int i=0; i<exp.length(); i++ )
		{
			char ch =exp.charAt(i);
			if( isCharacterOrDigit(ch))
				result += ch;
				//System.out.println("of");
			
			else if('('==ch)			//	opened bracket? push : don't push. 
				stk.push(ch);
			
			else if(')'==ch)	//  closed bracket ? pop until find the '(' or open bracket. 
			{
				while(!stk.isEmpty() 
							&& stk.peek() != '(')
				{
					result += stk.peek();	
					stk.pop();	//pop until find the '(' or open bracket.
				}
				stk.pop(); //this pop only for '(' bracket if exist.
			}
			else
			{
				while(!stk.isEmpty()
						&& prec(ch) <= prec(stk.peek()))
				{
					result += stk.peek();
					stk.pop();
				}
				stk.push(ch);
			}
			
		}
		
		//corner-case for invalid input.
		while (!stk.isEmpty()) {
            if (stk.peek() == '(')
                return "Invalid Expression";
            result += stk.peek();
            stk.pop();
        }
		return result;
	}
	
	public static void main(String[] args) {
		String exp = "7+(4-3)";
		System.out.println("Infix: "+exp);
		System.out.println("Postfix: "+inxToPost(exp));
	}

}
