import java.util.*;
public class Josephus 
{ 
	static void josh(List<Integer>p, int k, int index )
	{
		int temp; 		if(p.size()==1) 
		{
			System.out.println("Winner is: "+p.get(0));
			return;
		}
		index = (index+k) % p.size();
		System.out.println( p.get(index-k) +" killed " +p.get(index));
		p.remove(index);
		josh(p,k,index);
	}
	public static void main(String[] args) 
	{
		int n = 14, k=2, index=0;		//number of person.
		k--;			//(k-1) person will be killed.
		List<Integer> person = new ArrayList<Integer>();
		
		for(int i=0; i<n; ++i) {
			person.add(i);
		}
		System.out.println(person);
		josh( person, k, index );
	}
}
