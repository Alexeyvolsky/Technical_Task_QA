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
public class ApartmentsModel {
    private String contentVideo;
    private String subject;
    private DealType dealType;
    private NumberOfRooms numberOfRooms;
    private String totalArea;
    private String livingArea;
    private String kitchenArea;
    private Bathroom bathroom;
    private Balcony balcony;
    private CeilingHeight ceilingHeight;
    private NumberOfLayouts numberOfLayouts;
    private Repair repair;
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
    private Currency currency;
    private String address;
    private String contactPerson;
}
