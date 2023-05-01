package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox extends BaseElement {
    private final static String NUMBER_CHECKBOX = "//label[@data-name='%s']";
    private final static String CHECKBOX_LOCATOR = "//label[@data-name='В новостройке']";


    public Checkbox(WebDriver driver) {
        super(driver);
    }

    public void clickCheckbox(By checkbox, String number) {
        WebElement check = driver.findElement(checkbox);
        scrollIntoView(check);
        jsClick(check);
        WebElement num = driver.findElement(By.xpath(String.format(NUMBER_CHECKBOX, number)));
        scrollIntoView(num);
        jsClick(num);
        jsClick(check);
    }
}
