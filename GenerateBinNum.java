import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class GenerateBinNum {

	public String[] generateBinaryNumbers(int n)
	{
		String res[] = new String[n];
		Queue<String> q = new LinkedList<>();
		q.offer("1");
		for( int i=0; i<n; i++)
		{
			res[i] = q.poll();
			String n1 = res[i] + "0";
			String n2 = res[i] + "1";
			q.offer(n1);
			q.offer(n2);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number: ");
		int num = sc.nextInt();
		System.out.println(" Binary numbers from 1 to "+num +" is:");
		GenerateBinNum obj = new GenerateBinNum();
		String r[] = new String[num];
		r=obj.generateBinaryNumbers(num);
		for( String print : r) {
			System.out.println(print);
		}
	}
}
