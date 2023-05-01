package tests;

import enums.*;
import models.RoomsModel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RoomsTest extends BaseTest{
    @BeforeMethod(alwaysRun = true)
    public void login(){
        loginPage.clickcookieButton();
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
    }
    @Test
    public void roomsTest(){
        postingPage.waitForEstateVisible();
        postingPage.actionToEstate();
        postingPage.clickRooms();
        roomsPage.uploadFile();
        RoomsModel roomsModel = RoomsModel.builder()
                .setContentVideo("https://www.youtube.com/@kufar_by")
                .setSubject("Квартира в Минске")
                .setDealType(DealType.SALE)
                .setNumberOfRooms(NumberOfRooms.FIVEANDMORE)
                .setTypeOfRoom(TypeOfRoom.PASSAGE)
                .setProposedRooms(ProposedRooms.ONE)
                .setTotalArea("30")
                .setLivingArea("20")
                .setKitchenArea("5")
                .setBathroom(Bathroom.SEPARATE)
                .setBalcony(Balcony.NO)
                .setCeilingHeight(CeilingHeight.TWOANDHALF)
                .setRepair(Repair.WITHOUTFINISHING)
                .setAvailabilityOfFurniture(AvailabilityOfFurniture.NO)
                .setFloors(Floors.FIFTH)
                .setFloorsOfHouse(FloorsOfHouse.FIFTEENTH)
                .setWallMaterial(WallMaterial.BLOCK)
                .setYearOfConstruction(YearOfConstruction.TWENTY01)
                .setWindowsLookOut(WindowsLookOut.EAST)
                .setHomeImprovement(HomeImprovement.ELEVATOR)
                .setState(State.RESELLERS)
                .setNumberAndDateOfTheContract("425/1 от 01.07.2021")
                .setDescription("qwertyuiopasfghjklzxcvbnm")
                .setAddress("Карла Маркса ул, 31, Минск")
                .setPrice("1000")
                .setContactPerson("Oleg")
                .build();
        roomsPage.fillformRoomsPage(roomsModel);
        postingPage.clickSubmitAnAdButton();
        Assert.assertTrue(postingPage.isModerationMessagePresent());
    }
}
