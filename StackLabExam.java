import java.util.Scanner;
public class StackLabExam {
	int stk[];
	static int top=-1;
	StackLabExam(int size)
	{
		stk = new int[size];
	}
	//ALL METHODS ARE:
	//PUSH
		public void push( int d ) {
			stk[++top]=d;
		}
		//POP
		public int pop() {
			int temp = stk[top];
			stk[top]=0;
			top--;
			return temp;
		}
		//PEEK
		public int peek() {
			int data = stk[top];
			return data;
		}
		
		//Displayb
		public void display ()
		{
			System.out.print("[ ");
			for ( int i=0; i<stk.length; i++ )
			{
				if(i%3==2) {
					System.out.print(stk[i]+ ", ");
				}
			}
			System.out.println(" ]");
		}
	public static void main (  String[] args  )
	{
		int input;
		Scanner sc = new Scanner( System .in );
		System.out.print("Please enter the number of input: ");
		input = sc.nextInt();
		
		StackLabExam st = new StackLabExam ( input);
		int v;
		for( int i=0; i<input; i++) {
			System.out.println("Enter for the : "+(i+1));
			v=sc.nextInt();
			st.push(v);
		}
		st.display();
	}
}

