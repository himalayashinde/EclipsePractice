package SplitValuesFromString;

public class splitData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Extract = "Please email us at mentor@rahulshettyacademy.com with below template to receive response";

		//System.out.println(Extract.split("at")[0].trim());
		System.out.println(Extract.split("at")[1].trim());
		String part2 =Extract.split("at")[1].trim().split("with")[0].trim();
		System.out.println(part2);
	}

}
