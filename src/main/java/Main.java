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
        String cssTopBanner = "img[src*='banner']";
        String cssShopPhoneTitle = "";
        String cssShopPhoneNumber = "";
        String cssContactTitle = "div#contact-link";
        String cssSignInTitle = "div.header_user_info";

        String xpathLogo = "//img[contains(@class,'logo')]";
        String xpathSearchField = "//input[@id='search_query_top']";
        String xpathSearchIcon = "//button[@name='submit_search']";
        String xpathCartTitle = "//div[@class='shopping_cart']/a";
        String cssLogo = "img.logo";
        String cssSearchField = "input#search_query_top";
        String cssSearchIcon = "button[name='submit_search']";
        String cssCartTitle = "a[title*='cart']";

        String xpathTab1Women = "(//a[@class='sf-with-ul'])[1]";
        String xpathTab2Dresses = "(//a[@class='sf-with-ul'])[4]";
        String xpathTab3Tshirts = "//ul[contains(@class,'sf-menu')]/li[3]";
        String cssTab1Women = "";
        String cssTab2Dresses = "";
        String cssTab3Tshirts = "";

        String xpathCrumbsHome = "//a[@class='home']";
//        String xpathCrumbsFirst = "//a[@class='home']/following-sibling::a";
        String xpathCrumbsFirst = "//div[contains(@class,'breadcrumb')]/a[2]";
        String xpathCrumbsSecond = "//span[@class='navigation-pipe']//text()";
//        String xpathCrumbsSecond = "//span[@class='navigation-pipe']//text()";

        String xpathAuthTitle = "//h1";
        String xpathCreateAccountTitle = "//form[@id='create-account_form']/h3";
        String xpathNewEmailHint = "//form[@id='create-account_form']/div";;
        String xpathNewEmailTitle = "//label[@for='email_create']";
        String xpathNewEmailField = "//input[@id='email_create']";
        String xpathCreateAccountButton = "//button[@id='SubmitCreate']";

        String xpathRegisteredTitle = "//form[@id='login_form']/h3";
        String xpathRegEmailTitle = "//label[@for='email']";
        String xpathRegEmailField = "//input[@id='email']";
        String xpathRegPasswordTitle = "//label[@for='passwd']";
        String xpathRegPasswordField = "//input[@id='passwd']";
        String xpathForgotLink = "//p[contains(@class,'lost_password')]/a";
        String xpathSingInButton = "//button[@id='SubmitLogin']";

    }
}
