package pages;

import elements.*;
import models.NewBuildingsModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewBuildingsPage extends BasePage{
    private final static By CHECKBOX_FLOORS = By.xpath("//div[@class='styles_button__rWv4I']");
    private final static String IMG_PATH = "/img/newBuiding.jpg";

    public NewBuildingsPage(WebDriver driver) {
        super(driver);
    }

    public void fillformNewBuildings(NewBuildingsModel newBuildingsModel){
        new Input(driver).setValue("content_video", newBuildingsModel.getContentVideo());
        new Input(driver).setValue("subject",newBuildingsModel.getSubject());
        new RadioButton(driver).clickRadiobutton(newBuildingsModel.getNumberOfRooms().getName());
        new RadioButton(driver).clickRadiobutton(newBuildingsModel.getTypeOfLayout().getName());
        new Checkbox(driver).clickCheckbox(CHECKBOX_FLOORS,newBuildingsModel.getFloorsOfHouse().getName());
        new RadioButton(driver).clickRadiobutton(newBuildingsModel.getCeilingHeight().getName());
        new RadioButton(driver).clickRadiobutton(newBuildingsModel.getWallMaterial().getName());
        new Dropdown(driver).selectOptionByText("new_buildings_year_built",newBuildingsModel.getDeadline().getName());
        new Input(driver).setValueAndClick(newBuildingsModel.getNameOfTheResidentialComplex().getName());
        new Dropdown(driver).selectOptionByText("new_buildings_builder", newBuildingsModel.getDeveloper().getName());
        new Input(driver).setValue("re_contract", newBuildingsModel.getNumberAndDateOfTheContract());
        new Textarea(driver).setValue("body", newBuildingsModel.getDescription());
        new Input(driver).setValue("price", newBuildingsModel.getPricePerM2());
        new Input(driver).setAddressValue("geocoder", newBuildingsModel.getAddress());
        new Input(driver).setValue("contact_person", newBuildingsModel.getContactPerson());
    }

    public void uploadFile()    {
        uploadFile(IMG_PATH);
    }
}
