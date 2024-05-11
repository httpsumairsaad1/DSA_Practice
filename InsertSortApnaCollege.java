public class InsertSortApnaCollege {
	public static void main (String [] args )
	{
		int arr[] = {16,1,5,3,9,11,14,56,12,2};
		
		for( int i=1; i<arr.length; i++)	//i=0 consider as sorted remaining unsoted.
		{
			int cur = arr[i];
			int j = i-1;	//last of sorted;
			
			//transvering in sorted array.
			while(j>=0 && cur < arr[j])		//for track sorted part, using 'j';
					    //  1 <  16 ---> 1st
			{
				arr[j+1] = arr[j];	//pushing
				j--;
			}
			//placement of elem.
			arr[j+1]=cur;	//current>arr[j] || add on start.
		}
		for( int i=0; i<arr.length; i++)	//i=0 consider as sorted.
		{
			System.out.println(arr[i]);
		}
	}
}
