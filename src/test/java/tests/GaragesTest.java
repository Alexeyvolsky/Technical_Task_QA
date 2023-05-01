package tests;

import enums.*;
import models.GaragesModel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GaragesTest extends BaseTest{
    @BeforeMethod(alwaysRun = true)
    public void login(){
        loginPage.clickcookieButton();
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
    }
    @Test
    public void garagesTest(){
        postingPage.waitForEstateVisible();
        postingPage.actionToEstate();
        postingPage.clickGarages();
        apartmentsPage.uploadFile();
        GaragesModel garagesModel = GaragesModel.builder()
                .setContentVideo("https://www.youtube.com/@kufar_by")
                .setSubject("Квартира в Минске")
                .setDealType(DealType.SALE)
                .setTotalArea("30")
                .setTypeOfObject(TypeOfObject.BOX)
                .setTypeOfParking(TypeOfParking.GROUND)
                .setHeating(Heating.OVEN)
                .setFacilities(Facilities.V220)
                .setNumberAndDateOfTheContract("425/1 от 01.07.2021")
                .setDescription("wzexrjuykhbytxzrerxtvkinjuyt")
                .setPrice("1234")
                .setAddress("Карла Маркса ул, 31, Минск")
                .setContactPerson("Дмитрий")
                .build();
        garagesPage.fillformGarages(garagesModel);
        postingPage.clickSubmitAnAdButton();
        Assert.assertTrue(postingPage.isModerationMessagePresent());
    }
}
