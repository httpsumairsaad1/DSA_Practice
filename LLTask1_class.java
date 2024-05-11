import java.util.Arrays;
import java.util.LinkedList;
public class LLTask1_class{
	public static void main(String [] args)
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("DOG");
		list.add("CAT");
		list.add("WHITE CAT");
		list.add("white DOG");
		list.add("horse");
		list.add("black DOG");
		list.add("cow");
		list.add("goat");
		list.add("deer");
		list.add("lion");
		System.out.println(list.get(4));
		System.out.println(list);
	}
}
