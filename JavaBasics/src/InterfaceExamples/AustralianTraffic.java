package InterfaceExamples;

public class AustralianTraffic implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic A= new AustralianTraffic();
		
		A.greenGo();
		A.redStop();
		A.FlashYellow();
		
		AustralianTraffic a= new AustralianTraffic();
		a.walkonSymbol();
	}

	public void walkonSymbol() {
		System.out.println("walk on the symbols shown");
	}
	
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Signal implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Signal implementation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Signal implementation");
	}

}
