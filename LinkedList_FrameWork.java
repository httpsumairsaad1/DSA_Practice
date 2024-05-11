import java.util.Arrays;
import java.util.LinkedList;
public class LinkedList_FrameWork {
	public static void main(String [] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(30);
		list.add(4);
		list.add(66);
		System.out.println(list);
		System.out.println(list.contains(8));
		list.removeLast();
		System.out.println("Address: "+list.indexOf(30));
		System.out.println(list);
		var array = list.toArray();
		System.out.println(Arrays.toString(array));
		System.out.println(array[0]);
	}
	
	
}
