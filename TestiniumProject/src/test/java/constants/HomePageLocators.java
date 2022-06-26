package constants;
import org.openqa.selenium.By;



public class HomePageLocators {

    public static final By LoginButton = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/button");
    public static final By userLoginName = By.xpath("//*[@id=\"header__container\"]/header/div[2]/div[3]/div/span/div/button/span");
    public static final By searchTextbox = By.id("search_input");
    public static final By searchButton = By.xpath("//*[@id=\"header__container\"]/header/div[1]/div[2]/form/div/div[2]/button");
    public static final By nextPage = By.cssSelector("a[href='https://www.lcwaikiki.com/tr-TR/TR/arama?q=pantolon'");

}