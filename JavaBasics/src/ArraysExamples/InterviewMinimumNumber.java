package ArraysExamples;

public class InterviewMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{2,-1,2},{3,1,7},{1,2,17}};
		int min=a[0][0];
		int max= a[0][0];
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2;j++) {
				
				System.out.print(a[i][j]+ "\t");
								
				if(min >= a[i][j])
					min=a[i][j];
					
			}
		System.out.print("\n");	
		//System.out.println("\nMinimum Number in matrix is "+ min);
		}
		
		System.out.println("\nMinimum Number in matrix is "+ min);


		System.out.println(" ");
		
	for(int i=0; i<=2; i++) {
		for(int j=0; j<=2;j++) {
			
			System.out.print(a[i][j]+ "\t");
							
			if(max <= a[i][j])
				max=a[i][j];
				
		}
	System.out.print("\n");	
	//System.out.println("\nMinimum Number in matrix is "+ min);
	}
	
	System.out.println("\nMaximum Number in matrix is "+ max);
	
	
	System.out.println("\nFind the Min number the find the max number in the column the min number is present\n");

	int mincolumn = 0;
	
	for(int i=0; i<=2; i++) {
		for(int j=0; j<=2;j++) {
			
			System.out.print(a[i][j]+ "\t");
							
			if(min >= a[i][j]) {
				min=a[i][j];
				 mincolumn = j;
			}
				
		}
	System.out.print("\n");	
	
	}
	
	int k = 0;
	int maxColumn = a[0][mincolumn];
	
	while(k<3) {
		
		if(a[k][mincolumn]> maxColumn){
			
			maxColumn=a[k][mincolumn];
		}
		k++;
	}
	
	System.out.println("\nMax Number in  min number column is "+ maxColumn);
	
	
	}// main
	
}//class

