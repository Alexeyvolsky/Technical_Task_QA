package tests;

import enums.*;
import models.ApartmentsModel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApartmentsTest extends BaseTest{
    @BeforeMethod(alwaysRun = true)
    public void login(){
        loginPage.clickcookieButton();
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
    }
    @Test
    public void positiveApartmentsTestsPrice(){
        postingPage.waitForEstateVisible();
        postingPage.actionToEstate();
        postingPage.clickAparments();
        apartmentsPage.uploadFile();
        ApartmentsModel apartmentsModel = ApartmentsModel.builder()
                .setContentVideo("https://www.youtube.com/@kufar_by")
                .setSubject("Апартаменты в Минске с видом на город")
                .setDealType(DealType.SALE)
                .setNumberOfRooms(NumberOfRooms.FIVEANDMORE)
                .setTotalArea("70")
                .setLivingArea("53")
                .setKitchenArea("10")
                .setBathroom(Bathroom.SEPARATE)
                .setBalcony(Balcony.NO)
                .setCeilingHeight(CeilingHeight.TWOANDHALF)
                .setNumberOfLayouts(NumberOfLayouts.ONE)
                .setRepair(Repair.WITHOUTFINISHING)
                .setFloors(Floors.FIFTH)
                .setFloorsOfHouse(FloorsOfHouse.FIFTEENTH)
                .setWallMaterial(WallMaterial.BLOCK)
                .setYearOfConstruction(YearOfConstruction.TWENTY01)
                .setWindowsLookOut(WindowsLookOut.EAST)
                .setHomeImprovement(HomeImprovement.ELEVATOR)
                .setState(State.RESELLERS)
                .setNumberAndDateOfTheContract("425/1 от 01.07.2021")
                .setDescription("Дом находится в закрытом квартале в центре столицы, доступ к которому есть только у жильцов. " +
                        "Внутри двора организовано много различных зон для отдыха, хорошая детская площадка, спортивная площадка. " +
                        "Видеонаблюдение. Шлагбаумы при въезде во двор. \n" +
                        "Сделан ремонт по дизайн-проекту. Использовали только качественные дорогие материалы, мебель и технику. " +
                        "Все продумано до мелочей! ")
                .setPrice("150000")
                .setAddress("Карла Маркса ул, 31, Минск")
                .setContactPerson("Олег").build();
        apartmentsPage.fillformApartments(apartmentsModel);
        postingPage.clickSubmitAnAdButton();
        Assert.assertTrue(postingPage.isModerationMessagePresent());
    }
}
