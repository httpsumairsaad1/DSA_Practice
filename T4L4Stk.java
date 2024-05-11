public class T4L4Stk {
	public int binarySearch( String [] Personlist, int length, String findPerson )
	{
		int upper = length-1;
		int lower = 0;
		int mid=0;
		while(lower<=upper)
		{
			mid = (lower + upper)/2;
			if(Personlist[mid].equals(findPerson))
				return mid;
			if(Personlist[mid].matches(findPerson))
				lower = mid+1;
			else {
				upper = mid-1;
			}
		}
		return -1;
	}
	public void check( int num, String  name) {
		if(num>0) {
			System.out.println(name + " found at: " + num);
		}
		else
		{
			System.out.println(name + " notfound");
		}
	}
	public static void main ( String []args )
	{
		T4L4Stk obj = new T4L4Stk();
		String []PersonList = {
				"Ahmed","Ali","Basit","Karim","Rizwan","Sarwar","Tariq","Taufiq","Yasin","Zulfiqar"};
		int l = PersonList.length;
		for( String s : PersonList )
			System.out.print(s+" ");	//each loop - end
		System.out.println();
		int result= obj.binarySearch(PersonList, l, "Aftab");
		obj.check(result, "Aftab");
		result= obj.binarySearch(PersonList, l, "Rizwan");
		obj.check(result, "Rizwan");
		result= obj.binarySearch(PersonList, l, "Rizwan");
		obj.check(result, "Tariq");
		
	}
}
