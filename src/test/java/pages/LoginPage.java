package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private final static By EMAIL_INPUT = By.id("login");
    private final static By PASSWORD_INPUT = By.id("password");
    private final static By LOGIN_BUTTON = By.xpath("//button[text()='Войти']");
    private final static By COOKIE_BUTTON = By.xpath("//button[text()='Принять']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void setEmailInput(String email) {
        driver.findElement(EMAIL_INPUT).sendKeys(email);
    }
    public void setPasswordInput(String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }
    public void clickcookieButton() {
        driver.findElement(COOKIE_BUTTON).click();
    }
    public boolean isLoginButtonPresent() {
        return driver.findElement(LOGIN_BUTTON).isDisplayed();
    }

}
