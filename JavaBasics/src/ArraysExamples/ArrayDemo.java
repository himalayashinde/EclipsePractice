package ArraysExamples;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[5];
		int b[]= {1,2,3,4,5,6,7,8,9};
		
		
		a[0]= 2;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=19;
		//a[5]=9;
		
		
		System.out.println("New array A");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

		System.out.println("New array B");
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}

}
