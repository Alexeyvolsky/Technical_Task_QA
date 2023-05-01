package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Textarea extends BaseElement   {

    public void setValue(String name, String value) {
        WebElement input = driver.findElement(By.name(name));
        scrollIntoView(input);
        input.sendKeys(value);
    }

    public Textarea(WebDriver driver) {
        super(driver);
    }
}
