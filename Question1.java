
public class Question1 {
	public static int minmax( int [] arr)
	{
		int temp=0;
		int max, min=0;
		for ( int i =0 ; i<7; i++)
		{
			min=arr[i];
			for( int j=0 ; j<7; j++)
			{
				if ( min>arr[j])
				{
					min=arr[j];
				}
			}
		}
		return  min;
	}
	public static void main(String[] args) {
		int arr [] = {24, 67, 88, 3, 12, 56, 13};
		int min = minmax(arr);
		int max=0;
		for(int i=0; i<arr.length; i++)
		{
			max= arr[i];
			for(  int j=1; j<arr.length; j++)
			{
				if(max<arr[j])
					max=arr[j];
			}
		}
		System.out.println("min"+min+"            max"+max);
	}

}
