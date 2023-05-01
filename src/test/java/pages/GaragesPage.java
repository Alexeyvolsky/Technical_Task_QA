package pages;

import elements.Checkbox;
import elements.Input;
import elements.RadioButton;
import elements.Textarea;
import models.GaragesModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GaragesPage extends BasePage{
    private final static By CHECKBOX_FACILITIES = By.xpath("//div[text()='Удобства']//ancestor::div[@class='styles_container__CW1_x styles_container__small__lEEz5']//div[@class='styles_button__rWv4I']");
    private final static String IMG_PATH = "/img/garages.jpg";

    public GaragesPage(WebDriver driver) {
        super(driver);
    }
    public void fillformGarages(GaragesModel garagesModel){
        new Input(driver).setValue("content_video", garagesModel.getContentVideo());
        new Input(driver).setValue("subject",garagesModel.getSubject());
        new RadioButton(driver).clickRadiobutton(garagesModel.getDealType().getName());
        new Input(driver).setValue("size",garagesModel.getTotalArea());
        new RadioButton(driver).clickRadiobutton(garagesModel.getTypeOfObject().getName());
        new RadioButton(driver).clickRadiobutton(garagesModel.getTypeOfParking().getName());
        new RadioButton(driver).clickRadiobutton(garagesModel.getHeating().getName());
        new Checkbox(driver).clickCheckbox(CHECKBOX_FACILITIES,garagesModel.getFacilities().getName());
        new Input(driver).setValue("re_contract", garagesModel.getNumberAndDateOfTheContract());
        new Textarea(driver).setValue("body", garagesModel.getDescription());
        new Input(driver).setValue("price", garagesModel.getPrice());
        new Input(driver).setAddressValue("geocoder",garagesModel.getAddress());
        new Input(driver).setValue("contact_person", garagesModel.getContactPerson());
    }
    public void uploadFile()    {
        uploadFile(IMG_PATH);
    }

}
