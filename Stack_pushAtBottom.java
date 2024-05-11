/**
 * Program: Stack ( Push At Bottom ).
 * by UMAIR SAAD.
 */ 
import java.util.Stack;

public class Stack_pushAtBottom {
	private int stk[];
	private int top=0;
	public static void pushAtBottom(int data, Stack<Integer> s)
	{
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(data, s);
		s.push(top);
	}
	public void push(int data)
	{
		//top = top+1;
		stk[++top]=data;
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(12);
		s.push(14);
		s.push(16);
		s.push(18);
		s.push(20);
		
		pushAtBottom(22, s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
	}

}
