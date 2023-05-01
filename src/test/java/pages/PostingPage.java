package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class PostingPage extends BasePage{
    private final static String CATEGORY = "//span[text()='%s']";
    private final static String ESTATE_CATEGORY = "//div[@class='styles_category__zr4IO styles_subcategory__dUgqO' and text()='%s']";
    private final static By ADD_PHOTOS = By.xpath("//span[@class ='styles_upload_button__tFsSn']");
    private final static By SUBMIT_AN_AD = By.xpath("//button[text()='Подать объявление']");
    private final static By ERROR_MESSAGE = By.xpath("//div[@class='styles_heading__XNk7F']");

    public PostingPage(WebDriver driver) {
        super(driver);
    }
    public void waitForEstateVisible() {
        waitForElementDisplayed(ADD_PHOTOS);
    }
    public void actionToEstate(){
        actions.moveToElement(driver.findElement(By.xpath(String.format(CATEGORY,"Недвижимость")))).build().perform();
    }
    public void clickNewBuildings(){
        driver.findElement(By.xpath(String.format(ESTATE_CATEGORY,"Новостройки"))).click();
    }
    public void clickAparments(){
        driver.findElement(By.xpath(String.format(ESTATE_CATEGORY,"Квартиры"))).click();
    }
    public void clickRooms(){
        driver.findElement(By.xpath(String.format(ESTATE_CATEGORY,"Комнаты"))).click();
    }
    public void clickHouses(){
        driver.findElement(By.xpath(String.format(ESTATE_CATEGORY,"Дома, агроусадьбы, коттеджи"))).click();
    }
    public void clickGarages(){
        driver.findElement(By.xpath(String.format(ESTATE_CATEGORY,"Гаражи и стоянки"))).click();
    }
    public void clickPlots(){
        driver.findElement(By.xpath(String.format(ESTATE_CATEGORY,"Участки"))).click();
    }
    public void clickCommercialEstate(){
        driver.findElement(By.xpath(String.format(ESTATE_CATEGORY,"Коммерческая недвижимость"))).click();
    }
    public void clickSubmitAnAdButton() {
        driver.findElement(SUBMIT_AN_AD).click();
    }

    public boolean isModerationMessagePresent()  {
        try {
            driver.findElement(ERROR_MESSAGE).isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
        return true;
    }

}
