package euro.genomics.scripts;

import org.testng.annotations.Test;

import euro.genomics.generics.Excel;
import euro.genomics.pom.EnterTimeTrackPage;
import euro.genomics.pom.LoginPage;

public class ValidLoginLogout extends BaseTest {
	
	@Test
	public void testValidLoginLogout()
	{
		String un=Excel.getCellValue(XL_PATH, "ValidLoginLogout",1, 0);
		String pw=Excel.getCellValue(XL_PATH, "ValidLoginLogout",1, 1);
		String hp=Excel.getCellValue(XL_PATH, "ValidLoginLogout",1, 2);
		String lp=Excel.getCellValue(XL_PATH, "ValidLoginLogout",1, 3);
		
		//enter valid un and pw
				LoginPage l=new LoginPage(driver);
				l.setUserName(un);
				l.setPassword(pw);
				//click login
				l.clickLogin();
				//verify homepage
				EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
				e.verifyTitle(hp);
				//click on logout
				e.clickLogoutLink();
				//verify loginpage
				l.verifyTitle(lp);
		
		
	}

}
