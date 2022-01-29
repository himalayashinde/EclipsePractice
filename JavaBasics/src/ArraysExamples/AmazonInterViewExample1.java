package ArraysExamples;

import java.util.ArrayList;

public class AmazonInterViewExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			int k=0;
			
			if (!a1.contains(a[i])) {
				a1.add(a[i]);
				k++;
				
				 for(int j=i+1;j<a.length;j++) {
					 if(a[i]==a[j])
					 {
						 k++;
					 }
				 }
				 System.out.println(a[i]+"  "+k);
				 
				 if(k==1) {
					 System.out.println("\nThe Unique Number is "+a[i] );
				 }
			}
		}

		// My code below
/*		int count = 0;

		for (int i = 0; i < a.length; i++) {
			// int index=a[i];
			System.out.println(" ");
			// System.out.print(index+" ");
			count = 0;
			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
					// System.out.print("Count of " + a[i] + "=" + count);
				}
			}

			System.out.print("Count of " + a[i] + "=" + count);
		}
*/

	}
}
