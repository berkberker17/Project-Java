package constants;
import org.openqa.selenium.By;

public class ProductDetailsPageLocators {
    public static final By totalPrice = By.xpath("//*[@id=\"rightInfoBar\"]/div[1]/div/div[2]/div/div/div/span[2]");
    public static final By addBasketButton = By.id("pd_add_to_cart");
    public static final By goToBasket = By.xpath("//*[@id=\"header__container\"]/header/div[1]/div[3]/div/div[2]/div[2]/div/div[2]/a");
}
