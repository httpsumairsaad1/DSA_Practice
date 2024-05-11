import java.util.Stack;
/*
 * 1.push()
 * 2.pop()
 * 3.peek()
 * 4.isEmpty()
 * 5.size()
 * 6.search()
 * 7.change(20, 17)
 * 8.contain()
 */
public class StackProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String > stk = new Stack  < > ();
		System.out.println("Empty?"+ stk.empty());
		stk.push("14");
		stk.push("144");
		stk.push("13");
		stk.push("1");
		stk.push("134");
		System.out.println("Stack"+ stk);
		System.out.println("Empty?"+ stk.empty());
		System.out.println("pop elem: "+ stk.pop());
		System.out.println("Stack"+ stk);
		System.out.println("size of stack: " + stk.size());
		System.out.println("search successfull: " + stk.search(134));
	}

}
