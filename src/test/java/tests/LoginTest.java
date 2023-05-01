package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void pozitiveLoginTest() {
        loginPage.clickcookieButton();
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
    }

}
