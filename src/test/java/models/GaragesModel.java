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
public class GaragesModel {
    private String contentVideo;
    private String subject;
    private DealType dealType;
    private String totalArea;
    private TypeOfObject typeOfObject;
    private TypeOfParking typeOfParking;
    private Heating heating;
    private Facilities facilities;
    private String numberAndDateOfTheContract;
    private String description;
    private String price;
    private String address;
    private String contactPerson;
}
