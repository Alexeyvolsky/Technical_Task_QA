package enums;

public enum TypeOfParking {
    ONTHEROOF("На крыше"), UNDERGROUND("Подземная"), GROUND("Наземная"), MULTILEVEL("Многоуровневая"), OPEN("Открытая");
    private final String name;

    TypeOfParking(String name) {
        this.name = name;
    }

    public static TypeOfParking fromString(String value) {
        for (TypeOfParking typeOfParking : TypeOfParking.values()) {
            if (typeOfParking.getName().equals(value)) {
                return typeOfParking;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
