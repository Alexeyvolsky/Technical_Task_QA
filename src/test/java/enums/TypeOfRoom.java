package enums;

public enum TypeOfRoom {
    PASSAGE("Проходная"), WITHINTRANCE("С отдельным входом");
    private final String name;

    TypeOfRoom(String name) {
        this.name = name;
    }

    public static TypeOfRoom fromString(String value) {
        for (TypeOfRoom typeOfRoom : TypeOfRoom.values()) {
            if (typeOfRoom.getName().equals(value)) {
                return typeOfRoom;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
