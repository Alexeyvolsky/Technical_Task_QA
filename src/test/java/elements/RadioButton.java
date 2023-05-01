package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class RadioButton extends BaseElement {

    private final static String RADIOBUTTON_LOCATOR = "//div[@class='styles_chip__n4IMg' and text()='%s']";


    public RadioButton(WebDriver driver) {
        super(driver);
    }

    public void clickRadiobutton(String name) {
        WebElement radiobutton = driver.findElement(By.xpath(String.format(RADIOBUTTON_LOCATOR, name)));
        scrollIntoView(radiobutton);
        jsClick(radiobutton);
    }
}
