public class InsertSort {
	private int a[];
	private int nEl;
	//----------------------------------------
	public InsertSort(int max) 		//constructor
	{
		a = new int[max];
		nEl=0;
	}
	//----------------------------------------
	public void insert(int value) {
		a[nEl] = value;
		nEl++;
	}
	//----------------------------------------
	public void display() {
		for(int j=0; j<nEl; j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
	//----------------------------------------
	public void sortInsert()
	{
		int i,j, temp;
		for(i=1; i<nEl; i++) {
			temp=a[i];
			for(j=i-1; j>=0 && temp<a[j]; j--) {
				a[j+1]=a[j];
			} 		// inner-forloop
			a[j+1]=temp;
		}				//outter-forloop
	}
	public static void main(String[] args) {
		int size=5; 
		InsertSort arr;
		 arr= new InsertSort(size);
		 //five-value insert.
		 arr.insert(59);
		 arr.insert(5);
		 arr.insert(42);
		 arr.insert(97);
		 arr.insert(2);
		 arr.display();		//before insert sort.
		 arr.sortInsert();
		 arr.display();	
	}

}
