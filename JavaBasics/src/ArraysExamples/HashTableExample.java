package ArraysExamples;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "GoodBye");
		hm.put(2, "Morning");
		hm.put(3, "Evening");
		
		System.out.println(hm);
		System.out.println(hm.get(2));
//		System.out.println(hm.get(22));
		System.out.println(hm.get(3));
		//hm.remove(3);
		//System.out.println(hm.get(3));
		
		Set sn = hm.entrySet();
		
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry mp=(Map.Entry)it.next();
			
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
	}

}
