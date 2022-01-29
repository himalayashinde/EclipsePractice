package NestetLoops;

public class NesterLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// nested loops 
		
		/*for (int i=1;i<=4;i++) {
			
			for (int j=1; j<=4; j++){
				
				System.out.println(i+" "+j);
				
			}
			System.out.println("\n");
			
		}*/
		
		int k=1;	
		//row
		for(int i=1; i<=4 ;i++) {
						//System.out.println("Value of i= "+ i);			
			//column
			int m;
			for(int j=1;j<=5-i; j++)
			{
				System.out.print(k+"\t");
				k++;
			
			}
			System.out.print("\n");
		}
		
	}

}

/*
 1 2 3 4
 5 6 7
 8 9
 10
 */