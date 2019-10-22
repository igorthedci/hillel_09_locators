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
        String xpathShopPhoneTitle = "//*[@class='shop-phone']//text()[2]";
        String xpathShopPhoneNumber = "//*[@class='shop-phone']//text()[3]";
        String xpathContactTitle = "//*[@id='contact-link']";
        String xpathSignInTitle = "//a[@class='login']";

        String xpathLogo = "//img[contains(@class,'logo')]";
        String xpathSearchField = "//input[@id='search_query_top']";
        String xpathSearchIcon = "//button[@name='submit_search']";
        String xpathCartTitle = "//div[@class='shopping_cart']/a";

        String xpathTab1Women = "(//a[@class='sf-with-ul'])[1]";
        String xpathTab1Dresses = "(//a[@class='sf-with-ul'])[4]";
        String xpathTab1Tshirts = "//ul[contains(@class,'sf-menu')]/li[3]";

        String xpathCrumbsHome = "//a[@class='home']";
//        String xpathCrumbsFirst = "//a[@class='home']/following-sibling::a";
        String xpathCrumbsFirst = "//div[contains(@class,'breadcrumb')]/a[2]";
        String xpathCrumbsSecond = "//span[@class='navigation-pipe']//text()";
//        String xpathCrumbsSecond = "//span[@class='navigation-pipe']//text()";

        String xpathAuthTitle = "//h1[@class='page-heading']";
        String xpathCreateAccountTitle = "//h3[@class='page-subheading']";
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
