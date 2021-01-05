package Page_Object_Framework.ChaseHomeLending;

import Reusable_Library.AbstractClassChase;
import Reusable_Library.ReusableMethodsLoggersPageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Learn extends AbstractClassChase {
    ExtentTest logger;

    public Learn(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = AbstractClassChase.logger;
    }//end of constructor method

    //Calculators Learn
    @FindBy(xpath = "//*[@aria-label='about mortage calculators, Learn more']")
    WebElement LearnMore;
    //Purchase rates
    @FindBy(xpath = "//*[@aria-label='See rates']")
    WebElement SeeRates;
    //Refinance rates
    @FindBy(xpath = "//*[@aria-label='to find about refinance rates, See now']")
    WebElement SeeNow;
    //Manage our mortgage
    @FindBy(xpath = "//*[@aria-label='Access dashboard']")
    WebElement AccessDashboard;

    public void learn() throws InterruptedException {
        ReusableMethodsLoggersPageObject.click(driver, LearnMore, logger, "Learn more - Calculators");
        Thread.sleep(2500);
        ReusableMethodsLoggersPageObject.click(driver, SeeRates, logger, "See rates - Purchase rates");
        Thread.sleep(2500);
        ReusableMethodsLoggersPageObject.click(driver, SeeNow, logger, "See Now - Refinance rates");
        Thread.sleep(2500);
        ReusableMethodsLoggersPageObject.click(driver, AccessDashboard, logger, "Access dashboard - Manage your mortgage");
    }
}//end of Learn
