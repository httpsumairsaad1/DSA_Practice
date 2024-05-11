import java.util.Scanner;
import java.util.Stack;
import java.util.Random;

public class T3L4Stk {
	String []s;
	private int top=-1;
	
	public T3L4Stk(int size)
	{
		s = new String[size];
	}
	public static void sleep( int time )
	{
		try{
			Thread.sleep(time);
		}catch( Exception e) {}
	}
	
	/*public void push( String str)
	{
		s[++top]= str;
	}*/
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char ch=' ';
	int count = 0;
	Random rand = new Random();
	String name = "";
	System.out.print("How many names you will guess: ");
	int range = in.nextInt();
	Stack<String>obj = new Stack<>();
	
	int j=0;
		while(j<=range-1)
		{
			ch = characters.charAt(rand.nextInt(characters.length()));
			//sleep(5000);
			System.out.println(ch+":");
			//System.out.print("Enter the name which starts from the letter"+ch);
			name = in.next();
			if(ch!=name.charAt(0) )
			{
				System.out.println("Invalid Data");
			}
			else
			{
				String find = name;
				if(name.equals(obj.search(find)))
				{
					System.out.println("Already exist");
				}
				else
				{
					int d = obj.search(name);
					//System.out.println(d);
					if(d>=0)
						System.out.println(" Already exist ! ");
					else
					{
						System.out.println("push the "+ name);
						obj.push(name);
						count+=100;
						
						//see stack value at a time
						//System.out.println(obj);
						//removeComments
					}
				}
			}
			j++;
		} 
		System.out.println("Stack is: "+obj 
							+"\n& score is: "+ count);
	}
}
