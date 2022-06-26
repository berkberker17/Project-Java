package constants;
import org.openqa.selenium.By;


public class BasketPageLocators {

    public static final By productPriceInCart = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[2]/div[2]/div[5]");
    public static final By quantityRaise = By.cssSelector("col-md-12 cart-header mb-20");
    public static final By quantityProduct = By.className("col-md-8 col-xs-9 pr-0 text-left");
    public static final By deleteButton = By.id("Cart_ProductDelete_919343624");
    public static final By emptyBasket = By.className("cart-empty-title");

}
