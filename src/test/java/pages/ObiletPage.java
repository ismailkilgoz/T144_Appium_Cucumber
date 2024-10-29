package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserDriver;

public class ObiletPage {
    public ObiletPage(){
        PageFactory.initElements(BrowserDriver.getBrowserDriver(),this);
    }

    @FindBy(xpath="(//*[@class='sidebar toggle'])[1]")
    public WebElement hamburgerMenu;


    @FindBy(xpath="//*[@class='language']")
    public WebElement dilSecenegibutonu;


    @FindBy(xpath="(//*[@data-language='tr-TR'])[1]")
    public WebElement turkishbutonu;

    @FindBy(xpath = "//*[@title='Currency Select']")
    public WebElement currencySelect;

    @FindBy(xpath = "(//*[@data-code='TRY'])[1]")
    public WebElement turkisLira;

    @FindBy(xpath = "//*[@id='search-button']")
    public WebElement saerchButon;

    @FindBy(xpath = "(//span[@class='amount-sign'])[1]")
    public WebElement TRfiyatbilgisi;


}