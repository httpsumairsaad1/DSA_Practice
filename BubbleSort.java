
public class BubbleSort {
	public void bubble_Sort(int []a, int n) {
		int round, i, temp;
		//logic
		for(round=1; round<=n-1; round++) {
			for(i=0; i<=n-1-round; i++) {
				if(a[i]>a[i+1]) 
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}  // method-end
	
	 public void display(int []a) {
		 for(int i: a) {
			 System.out.print(i+",");
		 }
	 }
	  
		public static void main (String []args )
		{
		BubbleSort bs = new BubbleSort();
		
		int arr[] = new int[5];
		arr[0]=12;
		arr[1]=8;
		arr[2]=14;
		arr[3]=13;
		arr[4]=6;
		
		int num = 5; // number of elements in an array.
		System.out.print("Before: ");
		bs.display(arr);
		bs.bubble_Sort(arr, num);
		System.out.print("\nAfter: ");
		bs.display(arr);
	}

}
