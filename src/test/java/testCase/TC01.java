package testCase;

import org.testng.annotations.Test;
//import org.testng.annotations.*;

 import testBase.WebTestBase;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	//import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	import pages.HomePage;
	import pages.LoginPage;
	import pages.MyAccountPage;
	

	public class TC01 extends WebTestBase {
		
		//crate method
		MyAccountPage myAccountPage;
		HomePage homePage;
		LoginPage loginPage;
		
		
		//loading the config file
		public TC01() {
			super();  //super of is child class which comtrol goes in parent class-webtestbase
		}
		@BeforeMethod
		public void BeforeMethod(){			
			//loading the driver file and establishing the connection loading the url.
			initialization();
						
			homePage = new HomePage();
			loginPage = new LoginPage();
			myAccountPage = new MyAccountPage();
			}
		
	
		
		/* */
			//for typing in seaech box (the power of subconcious mind)and searching for same and checking assert equal and using drop down clicked the best seller
			@Test
			public void verifySearchBar(){
			SoftAssert softAssert = new SoftAssert();
			myAccountPage.search();
			softAssert.assertAll();}
			


			//mouse hovering on the user
			@Test
			public void verifyMouseHover(){
			SoftAssert softAssert = new SoftAssert();
			myAccountPage.mouseHover();
			softAssert.assertAll();
			}


			
			//to scroll down upto u-tube image icon
			@Test
			public void verifyScrollDown(){
			SoftAssert softAssert = new SoftAssert();
			myAccountPage.scrollDownMethod();
			softAssert.assertAll();
			}


			//click utube option and switching to that window
			@Test
			public void verifyGetWindowHandle(){
				SoftAssert softAssert = new SoftAssert();
				myAccountPage.windowHandle();
				softAssert.assertAll();
				}

				//printing the cookies in the window
				@Test
				public void verifyCookiesHandle(){
				SoftAssert softAssert = new SoftAssert();
				myAccountPage.getCookiesHandle();
				softAssert.assertAll();
				}
 
				//to scrollup to logo
				@Test
				public void verifyScrollUp(){
				SoftAssert softAssert = new SoftAssert();
				myAccountPage.scrollUpMethod();
				softAssert.assertAll();
				}

				//to scroll down Career Option
			@Test
			public void verifyCareerOption(){
			SoftAssert softAssert = new SoftAssert();
			myAccountPage.scrollToCareerOption();
			softAssert.assertAll();
			}
			
			@Test
			public void verifyGetWindowCareerHandle(){
				SoftAssert softAssert = new SoftAssert();
				myAccountPage.windowCareerHandle();
				softAssert.assertAll();
				}

		
				@AfterMethod
				public void afterMethod(){
				driver.close();
				}
				

		}
			