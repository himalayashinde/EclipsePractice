package NestetLoops;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print("My logic below");
		
		int n=1;
		
		for(int i=1;i<6;i++ )
		{
			for(int j=i;j>1;j--) {
				System.out.print(n++ +"\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("Rahul Shetty Logic below\n");
		
		int k=1;
		for(int i=1;i<5;i++ )
		{
			for(int j=1;j<=i;j++) {
				System.out.print(k++ +"\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("New pattern below \n");
		
		for(int i=1;i<5;i++ )
		{
			for(int j=1;j<=i;j++) {
				System.out.print(j +"\t");
			}
			System.out.println("\n");
		}
		
		System.out.println(" Another new pattern\n");		
		
		
		int l=1;
		for(int i=1;i<5;i++ )
		{
			for(int j=1;j<=i;j++) {
				System.out.print(l++ *3 +"\t");
			}
			System.out.println("\n");
		}
	}

}

/*
1
2 3
4 5 6
7 8 9 10
*/
