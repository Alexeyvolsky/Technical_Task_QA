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
public class NewBuildingsModel {
    private String contentVideo;
    private String subject;
    private NumberOfRooms numberOfRooms;
    private TypeOfLayout typeOfLayout;
    private FloorsOfHouse floorsOfHouse;
    private CeilingHeight ceilingHeight;
    private WallMaterial wallMaterial;
    private Deadline deadline;
    private NameOfTheResidentialComplex nameOfTheResidentialComplex;
    private Developer developer;
    private String numberAndDateOfTheContract;
    private String description;
    private String pricePerM2;
    private String address;
    private String contactPerson;

}
