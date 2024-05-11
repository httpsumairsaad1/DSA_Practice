import java.util.*;
public class addAll_LL {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "U", "M", "A", "I", "R");
		System.out.println(list);
		ListIterator<String> it = list.listIterator();
		System.out.println("it.nextIndex(): " + it.nextIndex());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.previousIndex(): " + it.previousIndex());
		System.out.println("it.nextIndex(): " + it.nextIndex());
		System.out.println("it.next(): " + it.next());
	}

}
