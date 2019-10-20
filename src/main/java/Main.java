import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        WebElement weTopBanner = driver.findElement();

        String xpathTopBanner = "//a[@title='']";
        String xpathShopPhoneTitle = ""; // //*[@class='shop-phone'][.='text']
        String xpathShopPhoneNumber = "";
        String xpathContactTitle = "//*[@id='contact-link']";
        String xpathSignInTitle = "//a[@class='login']";

        String xpathLogo = "//img[contains(@class,'logo')]";
        String xpathSearchField = "//input[@id='search_query_top']";
        String xpathSearchIcon = "//button[@name='submit_search']";
        String xpathCartTitle = "//div[@class='shopping_cart']/a";

        String xpathTab1Women = "(//a[@class='sf-with-ul'])[1]";
        String xpathTab1Dresses = "(//a[@class='sf-with-ul'])[4]";
        String xpathTab1Tshirts = "";

        String xpathCrumbsHome = "";
        String xpathCrumbsFirst = "";
        String xpathCrumbsSecond = "";

        String xpathAuthTitle = "";
        String xpathCreateAccountTitle = "";
        String xpathNewEmailHint = "";
        String xpathNewEmailTitle = "";
        String xpathNewEmailField = "";
        String xpathCreateAccountButton = "";

        String xpathRegisteredTitle = "";
        String xpathRegEmailTitle = "";
        String xpathRegEmailField = "";
        String xpathRegPasswordTitle = "";
        String xpathRegPasswordField = "";
        String xpathForgotLink = "";
        String xpathSingInButton = "";

    }
}
