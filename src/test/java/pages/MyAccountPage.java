package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import util.Utility;

public class MyAccountPage extends WebTestBase{
	@FindBy(xpath = "//h1[text()='My Account']")
    WebElement accountTitle;

    @FindBy(xpath = "//*[@id=\"container\"]/header/div/div/div[2]/div/div/div[2]/div/form/fieldset/div/input")
    WebElement searchTextBox;

    @FindBy(xpath = "//*[@id=\"container\"]/header/div/div/div[2]/div/div/div[3]")
    WebElement searchBtn;

    @FindBy(xpath = "//button[@data-aut-id='searchBox']")
    WebElement searchTitle;

    @FindBy(xpath = "//*[@id=\"container\"]/header/div/div/div[3]/div[1]/div/span[2]/button")
    WebElement dropDown;

    @FindBy(xpath = "//a[@class='_2gQlU']")
    WebElement hover;

    @FindBy(xpath = "//a[@data-aut-id='Youtube']")
    WebElement youtubeOption;

    @FindBy(xpath = "//a[@data-aut-id='btnOlxLogo']")
    WebElement logoSign;

    @FindBy(xpath = "//a[@class='QUhEK']")
    WebElement careerOption;

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }
    public String getTextOFMYAccountPage() {
    	return accountTitle.getText();
    }
    public void search() {
    	searchTextBox.click();
    	searchTextBox.sendKeys("mobiles");
    	searchBtn.click();    		
    }
    /*public String getTextOfSearch() {
    	return searchTitle.getText();
    }*/

    
    public void selectDropDown(String term, String value){
        dropDown.click();
        Utility.selectValue(dropDown,term,value);
       // dropDown.click();
        //dropDown.click();

    }
 /*
  public void clickElement(String value) {
  	//WebElement elementclick;
	//elementclick.click();
   Utility.selectValue(dropDown,value);
   }
  
*/    
    
    
    public void mouseHover(){
       Utility.mouseHover(driver,hover);
    }
    
    public String getTextOfSearch() {
    	return searchTitle.getText();//return text there in search title
    }
   

    public void scrollDownMethod() {
        Utility.scrollDownByElement(driver, youtubeOption);
        youtubeOption.click();

    }

    public void scrollUpMethod() {
        Utility.scrollUp(driver, logoSign);
     
    }

    public void scrollToCareerOption() {
        Utility.scrollToCareerOption(driver, careerOption);
        careerOption.click();

    }
    
    public void windowHandle(){
        Utility.scrollDownByElement(driver, youtubeOption);
        youtubeOption.click();
        Utility.switchToWindows(driver);
    }

    public void windowCareerHandle(){
        Utility.scrollDownByElement(driver, careerOption);
        careerOption.click();
        Utility.switchToWindows(driver);
    }
    
    public void getCookiesHandle(){
    Utility.getCookies();
    }
	
	}


