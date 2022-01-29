package ArraysExamples;

public class AmazonInterViewExample {

	static int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
	static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < a.length; i++) {
			// int index=a[i];
			System.out.println(" ");
			// System.out.print(index+" ");
			count = 0;
			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
					//System.out.print("Count of " + a[i] + "=" + count);
				}
			}
			
			
			System.out.print("Count of " + a[i] + "=" + count);
		}
		
		
		
		
	}
}
