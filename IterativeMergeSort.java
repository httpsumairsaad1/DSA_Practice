public class IterativeMergeSort {
	public static void mergeSort( int [] array)
	{
		if( array == null )
			return;
		if(array.length>1)
		{
			int mid = array.length/2;
			
			//split left part 
			int [] left = new int[mid];
			for( int i=0; i<mid; i++  ) {
				left[i]= array[i];
			}
			
			//split right part
			int right [] = new int [ array.length-mid ];
			for( int i =mid; i<array.length; i++) {
				right[i-mid]= array[i];
			}
			mergeSort(left);
			mergeSort(right);
			
			int i=0;
			int j=0;
			int k=0;
			
			while( i<left.length && j<right.length)
			{
				if( left[i]<right[i])
				{
					array[k]=left[i];
					i++;
				}
				else
				{
					array[k]=right[j];
					j++;
				}
				k++;
			}
			
			//collect remaining elements.
			while( i<left.length )
			{
				array[k]=left[i];
				i++;
				k++;
			}
			//collect remaining elements.
			while( j<right.length )
			{
				array[k]=right[j];
				j++;
				k++;
			}
		}
	}
	public static void main (  String [] args )
	{
		int arr [] = { 12, 13, 1, 6, 8};
		System.out.print("Given array is: ");
		
		for( int i : arr)
			System.out.print(i+" ");
		
		mergeSort(arr);
		
		System.out.print("\nSorted array: ");
		
		for( int i : arr )
			System.out.print(i+" ");
	}
}
