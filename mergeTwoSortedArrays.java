import java.util.Arrays;
public class mergeTwoSortedArrays {
	public static void merge(int []x , int []y)
	{
		int m = x.length;
		int n = y.length;
		for( int i=0; i<m; i++) {
			if(x[i]>y[0]) {
				int temp = x[i];
				x[i]=y[0];
				y[0]=temp;
				
				int first = y[0];
				int k;
				for(k=1; k<n && y[k]<first; k++) {
					y[k-1]=y[k];
				}
				y[k-1]=first;
			}
		}
	}
	public static void main(String[] args) {
		int []x = {1,4,7,8,9};
		int []y = {2,3,10};
		System.out.println("X: "+ Arrays.toString(x));
		System.out.println("Y: "+ Arrays.toString(y));
		System.out.println("************************");
		merge(x,y);
		System.out.println("X: "+ Arrays.toString(x));
		System.out.println("Y: "+ Arrays.toString(y));
	}
}
