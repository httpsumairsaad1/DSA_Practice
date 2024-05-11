// Java Program to convert postfix to prefix
import java.util.*;
import java.util.Stack;

class PostfixToPrefix {

	// function to check if character
	// is operator or not
	static boolean isOperator(char x)
	{

		switch (x) {
		case '+':
		case '-':
		case '/':
		case '*':
			return true;
		}
		return false;
	}

	// Convert postfix to Prefix expression
	static String postToPre(String post_exp)
	{
		Stack <String > stk = new Stack  < > ();

		// length of expression
		int length = post_exp.length();

		// reading from right to left
		for (int i = 0; i < length; i++) {

			// check if symbol is operator
			if (isOperator(post_exp.charAt(i))) {

				// pop two operands from stack
				String op1 = stk.peek();
				stk.pop();
				String op2 = stk.peek();
				stk.pop();

				// concat the operands and operator
				String temp
					= post_exp.charAt(i) + op2 + op1;

				// Push String temp back to stack
				stk.push(temp);
			}

			// if symbol is an operand
			else {

				// push the operand to the stack
				stk.push(post_exp.charAt(i) + "");
			}
		}

		// concatenate all strings in stack and return the
		// answer
		String ans = "";
		for (String i : stk)
			ans += i;
		return ans;
	}

	// Driver Code
	public static void main(String args[])
	{
		String post_exp = "ABC/D+E-*";

		System.out.println("Postfix: "
				+ (post_exp));
		// Function call
		System.out.println("Prefix : "
						+ postToPre(post_exp));
	}
}

// This code is contributed by Arnab Kundu
