package ArraysExamples;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[2][2];
		
		int ba[][]= { {2,4,5},{6,7,8}};
		
		a[0][0]=22;
		a[0][1]=23;
		a[1][0]=24;
		a[1][1]=25;
		
		for(int i=0; i<=1; i++)
			for(int j=0; j<=1;j++)
				System.out.println(a[i][j]);
		
		
	}

}
