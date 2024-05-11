import java.util.*; 	//Scanner, Random 
public class MergeSort {
	private static void sort(int []arr, int []temp, int low, int high)
	{
		if(low<high)
		{
			int mid = low + ( high - low)/2; 	// more better than (low+high)/2
			sort(arr, temp, low, mid);
			sort(arr, temp,mid+1, high);
			merge(arr, temp, low, mid, high);
		}
	}
	private static void merge(int []arr, int []temp, int low, int mid, int high)
	{
		for(int i=low; i<=high; i++) {
			temp[i]=arr[i];			//copy values.
		}
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid && j<=high) {
			if(temp[i]<=temp[j]) {
				arr[k]=temp[i];	
				i++;
			}else {
				arr[k]=temp[j];
				j++;
			}
			k++;
		}
		
		//right array is exhausted.
		while(i<=mid) {
			arr[k]=temp[i];
			i++;
			k++;
		}
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner( System .in );
		Random num = new Random();
		System.out.print("Enter the array size:");
		int size = sc.nextInt();
		int [] arr = new int [size];
		int [] temp = new int [size];
		System.out.println("Random values: ");
		for(int c=0;c<size;c++) {
			arr[c]= num.nextInt(20);
			System.out.print(arr[c]+" ");
		}
		System.out.println();
		MergeSort.sort(arr, temp, 0, size-1);
		System.out.println("Sorted array:");
		for( int i : arr ) {
			System.out.print(i+" ");
		}
	}	
}
