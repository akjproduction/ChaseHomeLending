package Page_Object_Framework.ChaseHomeLending;

import Reusable_Library.AbstractClassChase;
import Reusable_Library.ReusableMethodsLoggersPageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Refinance extends AbstractClassChase {
    ExtentTest logger;

    public Refinance(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = AbstractClassChase.logger;
    }//end of constructor method

    //overview
    @FindBy(xpath = "//*[@href='#linktotop']")
    WebElement Overview;

    // what do you want to do
    @FindBy(xpath = "//*[@href='#want']")
    WebElement Want;

    //Today's Refinance rate
    @FindBy(xpath = "//*[@href='#rate']")
    WebElement Rate;

    //Contact us
    @FindBy(xpath = "//*[@href='#cont']")
    WebElement ContactUs;


    //Refinance learning center
    @FindBy(xpath = "//*[@href='#learn']")
    WebElement Learn;


    public void refinance() throws InterruptedException {
        ReusableMethodsLoggersPageObject.click(driver,Overview,logger,"Overview");
        Thread.sleep(2500);
        ReusableMethodsLoggersPageObject.click(driver,Want,logger,"What do you want to do");
        Thread.sleep(2500);
        ReusableMethodsLoggersPageObject.click(driver,Rate,logger,"Today's Refinance Rate");
        Thread.sleep(2500);
        ReusableMethodsLoggersPageObject.click(driver,ContactUs,logger,"Contact us");
        Thread.sleep(2500);
        ReusableMethodsLoggersPageObject.click(driver,Learn,logger,"Refinance learning center");
    }//end of refinance

}//end of Refinance
