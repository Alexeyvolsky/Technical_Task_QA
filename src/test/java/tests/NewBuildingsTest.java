package tests;

import enums.*;
import models.NewBuildingsModel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewBuildingsTest extends BaseTest {
    @BeforeMethod(alwaysRun = true)
    public void login() {
        loginPage.clickcookieButton();
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
    }

    @Test
    public void newBuildingsTest() {
        postingPage.waitForEstateVisible();
        postingPage.actionToEstate();
        postingPage.clickNewBuildings();
        newBuildingsPage.uploadFile();
        NewBuildingsModel newBuildingsModel = NewBuildingsModel.builder()
                .setContentVideo("https://www.youtube.com/@kufar_by")
                .setSubject("Квартира в Минске не дорого")
                .setNumberOfRooms(NumberOfRooms.ONE)
                .setTypeOfLayout(TypeOfLayout.FREELAYOUT)
                .setFloorsOfHouse(FloorsOfHouse.TWENTYSEVENTH)
                .setCeilingHeight(CeilingHeight.THREE)
                .setWallMaterial(WallMaterial.MONOLITHIC)
                .setDeadline(Deadline.FOURTHQUARTER)
                .setNameOfTheResidentialComplex(NameOfTheResidentialComplex.MOD_HOUSE)
                .setDeveloper(Developer.A_100)
                .setNumberAndDateOfTheContract("425/1 от 01.07.2021")
                .setDescription("qwertyuiopasfghjklzxcvbnm")
                .setAddress("Карла Маркса ул, 31, Минск")
                .setPricePerM2("1230")
                .setContactPerson("Дмитрий").build();
        newBuildingsPage.fillformNewBuildings(newBuildingsModel);
        postingPage.clickSubmitAnAdButton();
        Assert.assertTrue(postingPage.isModerationMessagePresent());
    }
}
