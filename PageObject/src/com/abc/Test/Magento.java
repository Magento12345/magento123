package com.abc.Test;


	
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.chrome.ChromeDriver;

		import com.abc.magento.Login;
		import com.abc.magento.Logout;
		
		
		import com.abc.magento.Welcom;

		public class Magento {

			public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
		         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		         driver.get("https://www.magento.com");
		         Welcom w = new Welcom(driver);
		         w.clickMyAccount();
		         Login l = new Login(driver);
		         l.clickTypeEmail();
		         l.clickTypePass();
		         l.clickLogin();
		         Logout lo = new Logout(driver);
		         lo.clickLogout();
			}

		}


	}

}
