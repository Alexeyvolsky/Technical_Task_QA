package models;

import enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "set")
public class RoomsModel {
    private String contentVideo;
    private String subject;
    private DealType dealType;
    private NumberOfRooms numberOfRooms;
    private TypeOfRoom typeOfRoom;
    private ProposedRooms proposedRooms;
    private String totalArea;
    private String livingArea;
    private String kitchenArea;
    private Bathroom bathroom;
    private Balcony balcony;
    private CeilingHeight ceilingHeight;
    private Repair repair;
    private AvailabilityOfFurniture availabilityOfFurniture;
    private Floors floors;
    private FloorsOfHouse floorsOfHouse;
    private WallMaterial wallMaterial;
    private YearOfConstruction yearOfConstruction;
    private WindowsLookOut windowsLookOut;
    private HomeImprovement homeImprovement;
    private State state;
    private String numberAndDateOfTheContract;
    private String description;
    private String price;
    private String address;
    private String contactPerson;

}
