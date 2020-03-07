package com.abc.magento;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Welcom {

		
			WebDriver driver;
			@FindBy(linkText="My Account")
			WebElement welcome;
			public Welcom(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			public void clickMyAccount()
			{
				welcome.click();
			}
			

		}



	
	
}
