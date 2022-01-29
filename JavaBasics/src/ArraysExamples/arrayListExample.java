package ArraysExamples;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Rahul");
		a.add("Java");
		
		System.out.println(a);
		
		a.add(0, "Hello");
		System.out.println(a);

		
/*		a.remove(1);
		a.remove("Java");
		
		System.out.println(a);

		a.removeAll(a);
		
		System.out.println(a);*/
				
		System.out.println(a.get(2));
		
		System.out.println(a.contains("Java"));
		
		System.out.println(a.indexOf("Rahul"));
		
		System.out.println(a.size());
		
		System.out.println(a.isEmpty());
		
	}

}
