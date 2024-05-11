

import java.util.Scanner;
public class fiveOperationOnArray
{
	int temp=0;
	// ascending Array
	public void ascending(int []arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	// descending Array
	public void descending(int []arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static int[] insert(int n, int arr[],int x, int pos)
    {
        int i;
 
        int newarr[] = new int[n + 1];
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }
    //delete elem in array.
    public void delete( int []arr, int element, int size)
    {
      for( int i=0; i<arr.length; i++)
      {
         if(element==arr[i])
         {
            for( int j=i; j<(size-1); j++)
               arr[j] = arr[j+1];
            System.out.println("\nRemoved the element successfully!");
            break;
         }
      }
    }
    //search
    public void search( int []arr, int x)
    {
    	int f=0;
    	int temp=0;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==x) {
				f=1;
				temp=i;
				break;
			}
    	}
    	if(f==1)
			System.out.print("found at:" + temp);
		else
			System.out.print("not found");
    }
    //update the elem
    public void update ( int [] arr, int pos, int newValue)
    {
    	pos--; // because array start from zero.
    	for ( int i=0 ; i<arr.length; i++)
    	{
    		if( i==pos )
    		{
    			arr[i]=newValue;
    		}
    	}
    } 
    //display
	public void display(int []a)
	{
		for ( int i=0; i<a.length; i++)
			System.out.print(a[i]+"\t");
	}
	public static void main(String[] args) {
		fiveOperationOnArray obj = new fiveOperationOnArray();
		int arr[] = {10, 30, 40, 45, 51};
		int num= arr.length;
		int value, pos, newValue; //insert in array 
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sorting ascending\n"
						 + "2. Sorting descending\n"
						 + "3. Add element\n"
						 + "4. delete element\n"
						 + "5. update element\n"
						 + "6. search element\n"
						 + "7. display\n"
						 + "0. exit\n"
						 + "*******************");
		int choose = 1;
		while(choose!=0)
		{ 
			System.out.println();
			choose = sc.nextInt();
		switch(choose)
		{
		case 1:
			{
				obj.ascending(arr);
				for ( int i=0; i<num; i++)
						System.out.print(arr[i]+"\t");
				break;
			}
		case 2:
			{
				obj.descending(arr);
				for ( int i=0; i<num; i++)
						System.out.print(arr[i]+"\t");
				break;
			}
		case 3:
			{
				System.out.print("Add element: ");
				value = 99;
				pos = 4;
				arr = insert(num, arr, value, pos);
				obj.display(arr);
				break;
			}
		case 4:
			{
				value = 45;
				num--;
				obj.delete(arr, value, num);
				break;
			}
		case 5:
			{
				System.out.print("Enter the position: ");
				pos = sc.nextInt();
				System.out.println();
				System.out.print("Enter the new Value: ");
				newValue = sc.nextInt();
				obj.update(arr, pos, newValue);
				break;
			}
		case 6:
			{
				System.out.print("Search element: ");
				pos = sc.nextInt();
				obj.search(arr, pos);
				break;
			}
		case 7:
			{
				obj.display(arr);
					break;
				} // case 7;
			} //switch end
		}
	}
}
