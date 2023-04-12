package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class LoginPage extends WebTestBase{
	@FindBy(name = "username")
    WebElement userTextBox;

    @FindBy(name = "password")
    WebElement passwordTextBox;

    @FindBy(linkText = "Log in")
    WebElement loginbtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
//sending the mobile no and password to the textbox to login
    public void login(String mobile, String password){
    userTextBox.sendKeys(mobile);
    passwordTextBox.sendKeys(password);
    loginbtn.click();
    }
}





