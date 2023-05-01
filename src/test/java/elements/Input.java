package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input extends BaseElement {

    private final static By RESIDENTIAL_COMPLEX_LOCATOR = By.cssSelector("div.styles_input__qygb0");
    private final static By RESIDENT_COMPLEX_INPUT_LOCATOR = By.xpath("//input[@placeholder='Выберите']");
    private final static By RESIDENT_COMPLEX_OPTION_LOCATOR = By.xpath("//div[@role='listbox']/div[@tabindex='0']");
    private final static By FIRST_ADDRESS = By.xpath("//div[@data-name='autocomplete-option-0']");

    public Input(WebDriver driver) {
        super(driver);
    }

    public void setValue(String name, String value) {
        WebElement input = driver.findElement(By.name(name));
        scrollIntoView(input);
        input.sendKeys(value);
    }

    public void setValueAndClick(String value)  {
        jsClick(driver.findElement(RESIDENTIAL_COMPLEX_LOCATOR));
        jsClick(driver.findElement(RESIDENT_COMPLEX_OPTION_LOCATOR));
    }

    public void setAddressValue(String name, String value)    {
        WebElement input = driver.findElement(By.name(name));
        scrollIntoView(input);
        input.sendKeys(value);
        driver.findElement(FIRST_ADDRESS).click();
    }

    public void jsSetValue(String id, String value) {
        jsSendKeysInSettings(id, value);
    }
}
