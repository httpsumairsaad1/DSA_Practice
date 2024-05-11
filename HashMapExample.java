import java.util.HashMap;
import java.util.*;

public class HashMapExample
{
    public static void main( String[] args )
    {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Apple");
        hashMap.put(2, "Ball");
        hashMap.put(3, "Cat");

        System.out.println("hashMap : " + hashMap + "\n");
        
        ArrayList  <String> set = ArrayList<>(hashMap.keySet());

        System.out.println("set : " + set + "\n");

        for( String key : set )
        {
            System.out.println(key);
        }

    }
}