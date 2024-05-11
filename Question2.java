
public class Question2 {
	//selection
	static int swap=0;
		public static int selectionSort(int[] arr){  
		
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber; 
	            swap++;
	        }
	        return swap;
		}
		public static void display(int []arr)
		{
			for(int i =0; i<arr.length; i++)
			{
				System.out.print(" "+ arr[i]);
			}
		}
	public static void main(String[] args) 
	{
		int arr[] = {4, 7, 12, 3, 9, 2, 6, 13, 16};
		System.out.println("unsorted:");
		display(arr);
		int swap = selectionSort(arr);
		System.out.println("\nsorted: and number of swap is: " + swap);
		display(arr);
	}
}
