package org.tibco.automation.shared.utilities;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadPayloads {
	
	private File file = null;
	private FileInputStream fis = null;
	private XSSFWorkbook wb = null;
	private XSSFSheet ws = null;
	
	public String[][] get_cell_value(String filename, String sheet) throws IOException{
		
		file = new File(filename);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet(sheet);
		
		int row_count = ws.getLastRowNum()+1;
		int col_count = ws.getRow(ws.getFirstRowNum()).getLastCellNum();
		
		String[][] data = new String[row_count][col_count];
		
		for(int i=0;i<row_count;i++){
			for(int j=0;j<col_count;j++){
				data[i][j]=ws.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
	
	@DataProvider
	public Object[] getPassword() throws IOException{
		file = new File(System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/sql_injection-payloads.xlsx");
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet("Sheet1");
		
		int row_count = ws.getLastRowNum()+1;
		int col_count = ws.getRow(ws.getFirstRowNum()).getLastCellNum();
		
		Object[][] data = new Object[row_count][col_count];
		
		for(int i=0;i<row_count;i++){
			for(int j=0;j<col_count;j++){
				data[i][j]=ws.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		Object[] pwords = new Object[row_count];
		
		for(int i=0;i<row_count;i++){
			for(int j=1;j<col_count;j=j+2){
				pwords[i]=data[i][j];
			}
		}
		return pwords;
	}
	
	@DataProvider
	public Object[] getURL_TA() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/url_redirection_TA.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));			
		Object[] ploads = new Object[strlist.size()];				
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}		
		return ploads;
	}
	
	@DataProvider
	public Object[] getURL_Tropos() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/url_redirection_Tropos.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));			
		Object[] ploads = new Object[strlist.size()];				
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}		
		return ploads;
	}
	
	@DataProvider
	public Object[] getURL_MainHelpPage() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/url_redirection_MainHelpPage.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));			
		Object[] ploads = new Object[strlist.size()];				
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}		
		return ploads;
	}
	
	@DataProvider
	public Object[] getURL_GlobalNavBar() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/url_redirection_GlobalNavBar.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));			
		Object[] ploads = new Object[strlist.size()];				
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}		
		return ploads;
	}
	
	@DataProvider
	public Object[] getURL_Solutions() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/url_redirection_Solutions.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));			
		Object[] ploads = new Object[strlist.size()];				
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}		
		return ploads;
	}
	
	@DataProvider
	public Object[] getxsspayloads() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/XSS_payloads.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));			
		Object[] ploads = new Object[strlist.size()];				
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}		
		return ploads;
	}
	
	@DataProvider
	public Object[] getxsspayloads1() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/XSS_payloads1.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));
		
		Object[] ploads = new Object[strlist.size()];
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}
		return ploads;
	}
	
	
	@DataProvider
	public Object[] getxsspayloads_Other() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/XSS_payloads_Other.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));		
		Object[] ploads = new Object[strlist.size()];
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}
		return ploads;
	}

	@DataProvider
	public Object[] getxsspayloads_CustomGrps() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/XSS_Payloads_CustomGrps.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));		
		Object[] ploads = new Object[strlist.size()];
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}
		return ploads;
	}
	
	@DataProvider
	public Object[] getURL() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/url_redirection.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));		
		Object[] ploads = new Object[strlist.size()];
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}
		return ploads;
	}
	
	@DataProvider
	public Object[] getURL_SQLInjection_TeamMembers() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/sql_injection_TeamMembers.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));			
		Object[] ploads = new Object[strlist.size()];				
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}		
		return ploads;
	}
	
	@DataProvider
	public Object[] urlManipulation_TeamMembers() throws IOException{
		String file = System.getProperty("user.dir") + "/src/org/tibco/automation/shared/data/files/urlManipulation_TeamMembers.txt";
		List<String> strlist = Files.readAllLines(Paths.get(file));			
		Object[] ploads = new Object[strlist.size()];				
		for(int i=0;i<strlist.size();i++){
			ploads[i]=strlist.get(i).toString();
		}		
		return ploads;
	}
}
