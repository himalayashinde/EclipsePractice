package HimalayaPractice.ExcelDriven;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExcelDriven ed= new ExcelDriven();
		
		ArrayList<String> datas= ed.getData("Add Profile");

		
		
		for(int i=0;i<datas.size();i++)
			System.out.println(datas.get(i));
		
		System.out.println("\n********************");
		System.out.println("For Each loop");
		System.out.println("********************\n");
		for(String v: datas)
		{
			System.out.println(v);
		}
		
	}

}
