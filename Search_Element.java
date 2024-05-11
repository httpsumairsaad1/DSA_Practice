import java.util.Scanner;
public class Search_Element {

	public static void main(String[] args) {
		int n, x, f=0, i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elem");
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter all elems");
		for ( i=0; i<n; i++)
			a[i]=sc.nextInt();
		System.out.print("Enter elem which you want to search");
		x=sc.nextInt();
		for(i=0;i<n;i++)
			if(a[i]==x) {
				f=1;
				break;
			}
		if(f==1)
			System.out.print("found at: "+i);
		else
			System.out.print("not found");
}
}
