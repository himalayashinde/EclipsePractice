package ajax.controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.poi.hssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;




@WebServlet("/AjaxHandler")
public class AjaxHandler extends HttpServlet {
private static final long serialVersionUID = 1L;

public AjaxHandler() {
  super();
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  doPost(request, response);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  //String name = request.getParameter("name");
  //response.getWriter().print("Hello "+ name + "!!");

	try {
    	
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=DataExported.xls");
        
    //	response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
   //  response.setHeader("Content-Disposition","attachment; filename=report.xlsx"); 
    	
    	
        HSSFWorkbook workbook = createExcel();
        workbook.write(response.getOutputStream());
    } catch (Exception e) {
        throw new ServletException("Exception in DownLoad Excel Servlet", e);
    }
}

private HSSFWorkbook createExcel() throws Exception {
	
	/*try {*/
    HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet worksheet = workbook.createSheet("Sheet 1");
    //HSSFSheet sheet =  workbook.createSheet("new sheet");

//    HSSFRow row1 = worksheet.createRow(0);
//
//    HSSFCell cellA1 = row1.createCell(0);
//    cellA1.setCellValue("Hurray! You did it.");
//    HSSFCellStyle cellStyle = workbook.createCellStyle();
//    cellA1.setCellStyle(cellStyle);
    
/*        HSSFRow rowhead=   worksheet.createRow((short)0);
    rowhead.createCell((short)0).setCellValue("SNo");
    rowhead.createCell((short)1).setCellValue("Name");
    rowhead.createCell((short)2).setCellValue("Address");
    rowhead.createCell((short)3).setCellValue("Contact No");
    rowhead.createCell((short)4).setCellValue("E-mail");
          */
	//request.getContentType();
	//request.getRequestDispatcher("Success2.jsp").forward(request,response);
    
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("Select * from employee");
    ResultSetMetaData rsmd = rs.getMetaData();
    int columnsNumber = rsmd.getColumnCount();
    System.out.println(columnsNumber);
    //int columnsNumber = rsmd.getRowValue();
    HSSFRow rowhead=   worksheet.createRow((short)0);
    
    for (int i = 1; i <= columnsNumber; i++) {        	
    	rowhead.createCell((short)i-1).setCellValue(rsmd.getColumnName(i));            
    }
    
/*     int i=1;
    while(rs.next()){
    HSSFRow row=   worksheet.createRow((short)i);
    row.createCell((short)0).setCellValue(Integer.toString(rs.getInt("id")));
    row.createCell((short)1).setCellValue(rs.getString("name"));
    row.createCell((short)2).setCellValue(rs.getString("address"));
    row.createCell((short)3).setCellValue(Double.toString(rs.getDouble("contactNo")));
    row.createCell((short)4).setCellValue(rs.getString("email"));
    i++;
    }*/
    
   int rowCount=1;
    
    //rs.absolute(1);
    while (rs.next()) {
    	//int getrow = rs.getRow();
    	
    	HSSFRow row=   worksheet.createRow((short)rowCount++);
    	
    	for (int i=1 ; i <= columnsNumber; i++) {
    		
    	 row.createCell((short)i-1).setCellValue(rs.getString(i));     	
    	       	 
    	
    	}//for loop close
    	//System.out.print("");
    }//while close
    
    
    FileOutputStream fileOut =  new FileOutputStream("DataExported.xls");
    workbook.write(fileOut);
    fileOut.close();
   
	
	/*} catch ( Exception ex ) {
	    System.out.println(ex);
	    
	}*/
	return workbook;
	
	
	
}
}