package pages;

import elements.*;
import models.RoomsModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RoomsPage extends BasePage{
    private final static By CHECKBOX_WINDOWS = By.xpath("//div[text()='Окна выходят']//ancestor::div[@class='styles_container__CW1_x styles_container__small__lEEz5']//div[@class='styles_button__rWv4I']");
    private final static By CHECKBOX_HOMEIMPROVEMENT = By.xpath("//div[text()='Обустройство дома']//ancestor::div[@class='styles_container__CW1_x styles_container__small__lEEz5']//div[@class='styles_button__rWv4I']");
    private final static String IMG_PATH = "/img/room.jpg";
    public RoomsPage(WebDriver driver) {
        super(driver);
    }
    public void fillformRoomsPage(RoomsModel roomsModel){
        new Input(driver).setValue("content_video", roomsModel.getContentVideo());
        new Input(driver).setValue("subject",roomsModel.getSubject());
        new RadioButton(driver).clickRadiobutton(roomsModel.getDealType().getName());
        new RadioButton(driver).clickRadiobutton(roomsModel.getNumberOfRooms().getName());
        new RadioButton(driver).clickRadiobutton(roomsModel.getTypeOfRoom().getName());
        new RadioButton(driver).clickRadiobutton(roomsModel.getProposedRooms().getName());
        new Input(driver).setValue("size",roomsModel.getTotalArea());
        new Input(driver).setValue("size_living_space",roomsModel.getLivingArea());
        new Input(driver).setValue("size_kitchen",roomsModel.getKitchenArea());
        new RadioButton(driver).clickRadiobutton(roomsModel.getBathroom().getName());
        new RadioButton(driver).clickRadiobutton(roomsModel.getBalcony().getName());
        new RadioButton(driver).clickRadiobutton(roomsModel.getCeilingHeight().getName());
        new RadioButton(driver).clickRadiobutton(roomsModel.getRepair().getName());
        new RadioButton(driver).clickRadiobutton(roomsModel.getAvailabilityOfFurniture().getName());
        new Dropdown(driver).selectOptionByText("floor",roomsModel.getFloors().getName());
        new Dropdown(driver).selectOptionByText("re_number_floors", roomsModel.getFloorsOfHouse().getName());
        new RadioButton(driver).clickRadiobutton(roomsModel.getWallMaterial().getName());
        new Dropdown(driver).selectOptionByText("year_built",roomsModel.getYearOfConstruction().getName());
        new Checkbox(driver).clickCheckbox(CHECKBOX_WINDOWS,roomsModel.getWindowsLookOut().getName());
        new Checkbox(driver).clickCheckbox(CHECKBOX_HOMEIMPROVEMENT,roomsModel.getHomeImprovement().getName());
        new RadioButton(driver).clickRadiobutton(roomsModel.getState().getName());
        new Input(driver).setValue("re_contract", roomsModel.getNumberAndDateOfTheContract());
        new Textarea(driver).setValue("body", roomsModel.getDescription());
        new Input(driver).setAddressValue("geocoder",roomsModel.getAddress());
        new Input(driver).setValue("price", roomsModel.getPrice());
        new Input(driver).setValue("contact_person", roomsModel.getContactPerson());
    }

    public void uploadFile()    {
        uploadFile(IMG_PATH);
    }
}
