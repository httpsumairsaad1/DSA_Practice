//import java.util.Stack;

public class Task1StkLab {
		
		private char[] s;
		private int top=0;
		public Task1StkLab( int size )
		{
			System.out.println("Program Start: ");
			s = new char[size];
		}
		public void push(char ch)
		{
			s[top++]=ch;
		}
		public char pop()
		{
			top--;
			char c= s[top];
			s[top]=0;
			return c;
		}
		public static void main(String []args)
		{
			Task1StkLab stk = new Task1StkLab(10);
			String str = "UNIVERSITY";
			
			for(int i=0; i<10; i++)
				{
					stk.push(str.charAt(i));
					//System.out.println(stk);
				}
			for( int i=0; i<10; i++) {
				System.out.println(stk.pop());
			}
		}
}
