package AbstractionExamples;

public class ChildAirCraft extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildAirCraft c= new ChildAirCraft();
		
		c.bodyColor();
		c.safetyGuidelines();
		c.engine();
		
		//ParentAirCraft p = new ParentAirCraft(); 
		
		
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
