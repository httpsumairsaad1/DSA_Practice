class A
{
	public void ascending(int []arr)
	{
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]> arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
class D
{
	public void descending(int []arr)
	{
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]< arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
public class DS_LAB01_T1 {

	public static void main(String[] args) {
		int []arr = {3,7,2,10,1,8,6,11,4};
		D des = new D();
		des.descending(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		A asc = new A();
		asc.ascending(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
