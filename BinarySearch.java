class Search {
	public Search()
	{
		System.out.print("Program Start ");
	}
	
	//method 
	public int bSearch(int [] arr, int n, int item)
	{
		int upper = n-1;
		int lower = 0;
		int mid=0;
		while(lower<=upper)
		{
			mid = (lower + upper)/2;
			if(arr[mid]==item)
				return mid;
			if(arr[mid]<item)
				lower = mid+1;
			else {
				upper = mid-1;
			}
		}
		return -1;
	}
}
public class BinarySearch
{
	public static void main( String [] args )
	{
		Search sc = new Search();
		int []arr = {3,5,7,9,11,13,15,17};
		int n = arr.length;
		int b = sc.bSearch(arr, n, 5);
			System.out.print("5 on "+b);
	}
}

