package enums;

public enum AvailabilityOfFurniture {
    YES("Есть"), NO("Нет");
    private final String name;

    AvailabilityOfFurniture(String name) {
        this.name = name;
    }

    public static AvailabilityOfFurniture fromString(String value) {
        for (AvailabilityOfFurniture availabilityOfFurniture : AvailabilityOfFurniture.values()) {
            if (availabilityOfFurniture.getName().equals(value)) {
                return availabilityOfFurniture;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
