import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;

class ExcelExport extends JFrame{
ResultSet rs;
ExcelExport(){
String data[][] = {{"",""}};
String col[] = {"Name","Address"};
final DefaultTableModel model = new DefaultTableModel(data,col);
final JTable table = new JTable(model);
JScrollPane pane=new JScrollPane(table);
JButton button=new JButton("Export");
JPanel panel=new JPanel();
JPanel panel1=new JPanel();
JPanel panel2=new JPanel();
final HSSFWorkbook wb = new HSSFWorkbook();
final HSSFSheet sheet = wb.createSheet("Excel Sheet");
try{
Connection con = null;
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
//com.mysql.cj.jdbc.Driver
Statement st = con.createStatement();
rs= st.executeQuery("Select * from person");
while(rs.next()){
model.insertRow(table.getRowCount(),new Object[]{rs.getString("name"),rs.getString("email"),rs.getString("age"),rs.getString("Mobile")});
}
model.removeRow(0);
panel1.add(pane);
panel2.add(button);
panel.add(panel1);
panel.add(panel2);
add(panel);
button.addActionListener(new ActionListener(){
//@SuppressWarnings("deprecation")
public void actionPerformed(ActionEvent ev){
try{
HSSFRow rowhead = sheet.createRow((short)0);
rowhead.createCell(0).setCellValue("Name");
rowhead.createCell(1).setCellValue("Email");
rowhead.createCell(1).setCellValue("Age");
rowhead.createCell(1).setCellValue("Mobile");
int index=1;
int count=table.getRowCount();
for(int i=0;i<count;i++){
Object obj1 = GetData(table, i, 0);
Object obj2 = GetData(table, i, 1);

HSSFRow row = sheet.createRow((short)index);
row.createCell(0).setCellValue(obj1.toString());
row.createCell(1).setCellValue(obj2.toString());
index++;
}
FileOutputStream fileOut = new FileOutputStream("c:\\Hello.xls");
wb.write(fileOut);
fileOut.close();
Runtime rt = Runtime.getRuntime();
rt.exec("cmd.exe /C start C:\\Hello.xls");
}
catch(Exception ex){}
}
});
}
catch(Exception e){}
}
public Object GetData(JTable table, int row_index, int col_index){
return table.getModel().getValueAt(row_index, col_index);
}
}
class JTableToExcel{
public static void main(String arg[]) {
try
{
	ExcelExport frame=new ExcelExport();
frame.setSize(450,200);
frame.setVisible(true);
}
catch(Exception e)
{}
}
}
