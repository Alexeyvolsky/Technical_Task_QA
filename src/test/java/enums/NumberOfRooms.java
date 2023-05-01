package enums;

public enum NumberOfRooms {
    ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVEANDMORE("5 и более");
    private final String name;

    NumberOfRooms(String name) {
        this.name = name;
    }

    public static NumberOfRooms fromString(String value) {
        for (NumberOfRooms numberOfRooms : NumberOfRooms.values()) {
            if (numberOfRooms.getName().equals(value)) {
                return numberOfRooms;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
