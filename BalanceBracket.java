import java.util.Stack;
public class BalanceBracket {
	
	public static boolean isValid(String s)
	{
		Stack<Character> stk = new Stack<>();
		for( char c: s.toCharArray()) {
			if( c=='(' || c=='{'|| c=='[')		//openBracket? push: No push;							
				stk.push(c);
			else 
			{
				if(stk.isEmpty())
					return false;
				else 
				{
					char top = stk.peek();
					
					//closed bracket found and also, that time open bracket found on the top.
					if((c==')' && top=='(')|| (c==']' && top=='[')|| (c=='}' && top=='{'))
						stk.pop();  
					else
						return false;
				}
			}
		}
		return stk.isEmpty();
	}
	public void check(boolean c)
	{
		if(c)
			System.out.println("Correct");
		else
			System.out.println("Not Correct");
	}
	public static void main(String[] args) {
		
		BalanceBracket obj = new BalanceBracket();
		String str = "{()}";
		boolean result = BalanceBracket.isValid(str);
		//System.out.print(result);
		obj.check(result);
		
		str = "{[(])}";
		result = BalanceBracket.isValid(str);
		//System.out.print(result);
		obj.check(result);
		
		str = "{{[[(())]]}}";
		result = BalanceBracket.isValid(str);
		//System.out.print(result);
		obj.check(result);
		
				

	}

}
