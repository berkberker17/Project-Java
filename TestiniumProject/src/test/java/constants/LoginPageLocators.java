package constants;

import org.openqa.selenium.By;

public class LoginPageLocators {

    public static final By username = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/div[2]/input");
    public static final By password = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/div[3]/div/input");
    public static final By LoginButton = By.xpath("//*[@id=\"login\"]/div/div/div/div/form/button");

}
