package collections;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap1 = new HashMap<String, Integer>();

		Hashtable<Integer, String> hashtable1 = new Hashtable<Integer, String>();
		HashMap<Integer, String> hashmap2 = new HashMap(hashtable1);
		hashmap1.put("gaurav", 100);
		hashmap1.put("gaurav", 90);
		hashmap1.put("saurav", 90);

		int value = hashmap1.get("gaurav");
		System.out.println("Value of gaurav :" + value);
		System.out.println("Size of hashmap :" + hashmap1.size());

		hashmap1.clear();
		System.out.println("Size of hashmap after clear " + hashmap1.size());
		// hashmap1.isEmpty();
		System.out.println("Is hash map empty " + hashmap1.isEmpty());

	}

}
