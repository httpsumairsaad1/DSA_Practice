

//Lab5-Practice1

class LLink
{
	public int iData;
	public double dData;
	public LLink next;
	public static int size;
	//contractor
	public LLink( int i, double d)
	{
		this.iData= i;
		this.dData=d;
		size++;
	}
	
	//display
	public void displayLink()
	{
		System.out.print("("+iData+", "+dData+")");
	}
}
class  LinkListMethod
{
	private LLink first;
	
	//contractor
	public LinkListMethod()
	{
		first=null;
	}
	
	//--------------------------------------
	public boolean isEmpty() {
		return (first==null);
	}
	
	//pracice2
	public boolean deleteFirst()
	{
		if(isEmpty())
			return false;
		LLink temp= first;
		first = first.next;
		temp.next = first;
		return true;
		
	}
	public boolean dltAll()
	{
		boolean res;
		if(isEmpty())
			return false;
		LLink cur=first;
		while(cur!=null) {
			res=deleteFirst();
			System.out.println("deleted?"+res);
			cur=cur.next;
		}
		return (isEmpty());
		
	} // practice2--END
	
	//============================================
	//practice3
	public int search(int i, double d)
	{
		for( int j=0; j<LLink.size; j++)
		{
			if(isEmpty())
				return -1;
			int idx=0 ;
			LLink temp = first;
			while(temp!=null)
			{
				if( temp.iData==i && temp.dData==d )	
				{
					return idx;
				}
				idx++;
				temp=temp.next;
			}
		}
		return -1;
	}
	
	public void dltGivenNode(int key)
	{
		LLink prev = first;
		int count=0;
		while(count<key-1)
		{
			prev=prev.next;
			count++;
		}
		LLink cur = prev.next;
		prev.next = cur.next;
		cur.next=null;
	}
	
	public void rev()
	{
		LLink curr = first;
		LLink prev = null;
		LLink forw = null;
		while(curr!=null) {
			forw=curr.next;
			curr.next = prev;
			prev=curr;
			curr= forw;
		}
	}
	public void insertFirst( int i, double d)
	{
		LLink ll = new LLink(i,d);
		ll.next=first;
		first=ll;
	}
	
	public void displayList()
	{
		System.out.println("List ( first ---> Last):");
		LLink cur=first;
		while(cur != null) {
			cur.displayLink();
			
			if(cur.next!=null)
				System.out.print(" ----->> ");
			cur=cur.next;
		}
		System.out.println("");
	}
}
public class Link
{
	public static void main( String[] args )
	{
		LinkListMethod thelist= new LinkListMethod();
		thelist.insertFirst(18, 99.99);
		thelist.insertFirst(43, 92.49);
		thelist.insertFirst(23, 73.82);
		thelist.displayList();
		
		//practice2
		boolean res= thelist.dltAll();
		System.out.println("List is Empty? "+res);
		thelist.displayList();
		thelist.insertFirst(18, 99.99);
		thelist.insertFirst(43, 92.49);
		thelist.insertFirst(23, 73.82);
		thelist.insertFirst(74, 23.45);
		thelist.insertFirst(11, 42.81);
		
		//practice3
		thelist.displayList();
		int atIdx= thelist.search(43, 92.49);
		System.out.println("(43, 92.49) found at: "+atIdx);
		thelist.displayList();
		thelist.dltGivenNode(1);
		thelist.displayList();
	}
}
