import java.util.*; 
public class SortRevMethod {
	public void rev(int[]arr)
	{
		int temp; 
		int r[]=new int[5];
		//d
		System.out.println("eer");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					r[j]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int j=0; j<r.length; j++) {
			System.out.println("rev: "+r[j]);
		}
		
	}
	public static void main(String[] args) {
		SortRevMethod s= new SortRevMethod();
		int arr[] = {13, 4, 1, 9,2};
		Arrays a;
		
		//Arrays.sort(arr);
		s.rev(arr);
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
