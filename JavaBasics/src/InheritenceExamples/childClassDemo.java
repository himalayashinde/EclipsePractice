package InheritenceExamples;

public class childClassDemo extends ParentClassDemo{

	public void engine() {
		System.out.println("New Generation Engines");
	}
	
	public void colour() {
		System.out.println(colour);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassDemo c = new childClassDemo();
		
		c.audiosystem();
		c.breaks();
		c.colour();
		c.engine();
		
	}

}
