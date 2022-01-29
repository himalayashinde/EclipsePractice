package ArraysExamples;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs= new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		
		System.out.println(hs);
		
		//hs.remove("INDIA");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

}
