package pages;

import elements.*;
import models.ApartmentsModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApartmentsPage extends BasePage{
    private final static By CHECKBOX_WINDOWS = By.xpath("//div[text()='Окна выходят']//ancestor::div[@class='styles_container__CW1_x styles_container__small__lEEz5']//div[@class='styles_button__rWv4I']");
    private final static By CHECKBOX_HOMEIMPROVEMENT = By.xpath("//div[text()='Обустройство дома']//ancestor::div[@class='styles_container__CW1_x styles_container__small__lEEz5']//div[@class='styles_button__rWv4I']");
    private final static String IMG_PATH = "/img/apartments.jpg";
    private final static String PRICE = "//div[@class='styles_price_block__ndGzS']//span[text()='%s']";


    public ApartmentsPage(WebDriver driver) {
        super(driver);
    }
    public void fillformApartments(ApartmentsModel apartmentsModel){
        new Input(driver).setValue("content_video", apartmentsModel.getContentVideo());
        new Input(driver).setValue("subject",apartmentsModel.getSubject());
        new RadioButton(driver).clickRadiobutton(apartmentsModel.getDealType().getName());
        new RadioButton(driver).clickRadiobutton(apartmentsModel.getNumberOfRooms().getName());
        new Input(driver).setValue("size",apartmentsModel.getTotalArea());
        new Input(driver).setValue("size_living_space",apartmentsModel.getLivingArea());
        new Input(driver).setValue("size_kitchen",apartmentsModel.getKitchenArea());
        new RadioButton(driver).clickRadiobutton(apartmentsModel.getBathroom().getName());
        new RadioButton(driver).clickRadiobutton(apartmentsModel.getBalcony().getName());
        new RadioButton(driver).clickRadiobutton(apartmentsModel.getCeilingHeight().getName());
        new RadioButton(driver).clickRadiobutton(apartmentsModel.getNumberOfLayouts().getName());
        new RadioButton(driver).clickRadiobutton(apartmentsModel.getRepair().getName());
        new Dropdown(driver).selectOptionByText("floor",apartmentsModel.getFloors().getName());
        new Dropdown(driver).selectOptionByText("re_number_floors", apartmentsModel.getFloorsOfHouse().getName());
        new RadioButton(driver).clickRadiobutton(apartmentsModel.getWallMaterial().getName());
        new Dropdown(driver).selectOptionByText("year_built",apartmentsModel.getYearOfConstruction().getName());
        new Checkbox(driver).clickCheckbox(CHECKBOX_WINDOWS,apartmentsModel.getWindowsLookOut().getName());
        new Checkbox(driver).clickCheckbox(CHECKBOX_HOMEIMPROVEMENT,apartmentsModel.getHomeImprovement().getName());
        new RadioButton(driver).clickRadiobutton(apartmentsModel.getState().getName());
        new Input(driver).setValue("re_contract", apartmentsModel.getNumberAndDateOfTheContract());
        new Textarea(driver).setValue("body", apartmentsModel.getDescription());
        new Input(driver).setAddressValue("geocoder",apartmentsModel.getAddress());
        new Input(driver).setValue("price", apartmentsModel.getPrice());
        new Input(driver).setValue("contact_person", apartmentsModel.getContactPerson());
    }

    public void uploadFile()    {
        uploadFile(IMG_PATH);
    }
    public  void clickPrice(String value){
        driver.findElement(By.xpath(String.format(PRICE,"Цена"))).click();
    }
    public  void clickPricePerM2(String value){
        driver.findElement(By.xpath(String.format(PRICE,"Цена за м²"))).click();
    }
}
