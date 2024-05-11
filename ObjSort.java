class Person
{
	private String lastname;
	private String firstname;
	private int age;
	//-------------------------
	public Person( String last, String first, int a)
	{
		this.lastname = last;
		this.firstname = first;
		this.age = a;
	}
	//-------------------------
	public void displayPerson()
	{
		System.out.print("Last name: " + lastname);
		System.out.print(", First name:" + firstname);
		System.out.println(", Age:"+ age);
	}
	//-------------------------
	public String getLast() {
		return lastname;
	}
}
class ArrayIbOj
{
	private Person []a;		//ref to Array a.
	private int nEl;
	//---------------------
	public ArrayIbOj( int max )
	{
		a = new Person[max];
		nEl=0;
	}
	//---------------------
	public void insert(String last, String first, int age)
	{
		a[nEl] = new Person(last, first, age);
		nEl++;
	}
	//---------------------
	public void display() // displays array contents
	{
		for(int j=0; j<nEl; j++) // for each element,
			a[j].displayPerson(); // display it
		System.out.println();
	}
	//---------------------
	public void insertSort()
	{
		int in, out;
		for(out=1; out<nEl ;out++)
		{
			Person temp = a[out];
			in=out;
			while(in>0 				//s1<s2<0, //s1==s2=0, //s1>s2>0.
					&& a[in-1].getLast().compareTo(temp.getLast())>0)
			{
				a[in] = a[in-1];
				--in;
			}
			a[in]=temp;
		}
	}
}
public class ObjSort {
	public static void main(String[] args) {
		int maxSize = 10;
		ArrayIbOj arr;
		arr = new ArrayIbOj(maxSize);	//create the array;
		arr.insert("Saad","Umar", 18);
		arr.insert("Saaadkjhkkh","Umar", 18);
//		arr.insert("Saad","Umair", 18);
//		
//		arr.insert("Sad","Uma", 18);
//		arr.insert("Haider","Ali", 19);
		System.out.println("Before:");
		arr.display();
		arr.insertSort();
		System.out.println("After:");
		arr.display();
	}

}
