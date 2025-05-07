package test_case;

import org.testng.annotations.Test;

import com.project.pages.BaseTest;
import com.project.pages.HomePage;
import com.project.pages.LoginPage;

public class TC_Login extends BaseTest {

//	public TC_Login(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}

	@Test
	public void login() {
		
		logger.info("***** Starting TC_Login *****");
		try {

		HomePage hp = new HomePage(driver);
		hp.clickLoginHome();

		LoginPage lp = new LoginPage(driver);
		lp.setEmailField("test@yopmail.com");
		lp.setPasswordField("12345678");
		lp.clickLoginHome();
		}
		catch(Exception e)
		{
			logger.error("Test failed.........");
			logger.debug("Debug logs........");
		}
		
		logger.info("***** End TC_Login *****");

	}

}
