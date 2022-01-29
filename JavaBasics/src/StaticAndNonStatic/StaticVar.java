package StaticAndNonStatic;

public class StaticVar {

	String name;
	

	String address;
	String city;
	
	StaticVar(String name, String address, String city){
		
		this.name = name;
		this.address = address;
		this.city = city;
		
	}
	
	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public String getCity() {
		return city;
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("Bob","Marthalli","Banglore");
		StaticVar obj1 = new StaticVar("Ram","Jayanagar","Banglore");
		
		System.out.println(obj.getName()+" "+obj.getAddress()+" "+obj.getCity());
		System.out.println(obj1.getName()+" "+obj1.getAddress()+" "+obj1.getCity());
	}

}
