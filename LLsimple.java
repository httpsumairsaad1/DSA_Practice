import java.util.LinkedList;

class LLsimple {
	LLsimple()
	{
		System.out.println("PROGRAM STARTED !!! ");
	}
	
	public static void main(String[] args) {
		new LLsimple();
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(78);
		ll.add(93);
		ll.add(48);
		ll.add(62);
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.add(12);
		ll.add(77);
		System.out.println(ll);
	}

}
