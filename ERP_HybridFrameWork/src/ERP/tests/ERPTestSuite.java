package ERP.tests;


import java.io.IOException;


import org.testng.annotations.Test;

import ERP.libraries.HomePage;
import ERP.libraries.LoginPage;
import utils.AppUtils;
import utils.XlUtils;

public class ERPTestSuite  {
	
	@Test
	public void testERP() throws IOException {
		
		String xlfile = "xlfile\\ERP Keywords.xlsx";
		String testcases = "TestCases";
		String teststeps = "TestSteps";
		
		int testcases_rows = XlUtils.getLastRow(xlfile, testcases);
		int teststeps_rows = XlUtils.getLastRow(xlfile, teststeps);	
		
		LoginPage lp = new LoginPage();
		HomePage hp = new HomePage();
		String  flag, tcid, tsid, keyword;
		String uname, pwd;
		boolean res;
		
		for(int i = 1; i<=testcases_rows; i++)
		{
			flag = XlUtils.getStringCellData(xlfile, testcases, i, 2);
			if(flag.equalsIgnoreCase("y"))
			{
//				tcid = XlUtils.getStringCellData(xlfile, testcases, i, 0);
//				for(int j=1; j<teststeps_rows; j++)
//				{
//					tsid = XlUtils.getStringCellData(xlfile, teststeps, j, 0);
//					if(tsid.equalsIgnoreCase(tcid)) {
//						keyword = XlUtils.getStringCellData(xlfile, teststeps, j, 4);
//						switch (keyword) {
//						case "login": 
//							uname = XlUtils.getStringCellData(xlfile, teststeps, j, 5);
//							pwd = XlUtils.getStringCellData(xlfile, teststeps, j, 6);
//							lp.login(uname, pwd);
//							res = hp.dashboard();
//							break;
//						
//						case "logout":
//							//lp.lo
//							break;
//						
//						}
//					}
//						
//				}
//				
			}
			else {
				XlUtils.setColData(xlfile, testcases, i, 4, "block");
				XlUtils.fillRedColor(xlfile, testcases, i, 4);
			}
			
		}
		
	
	}

}
