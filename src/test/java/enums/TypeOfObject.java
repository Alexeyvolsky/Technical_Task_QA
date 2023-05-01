package enums;

public enum TypeOfObject {
    PARKINGPLACE("Машиноместо"), GARAGE("Гараж"), BOX("Бокс"), OTHER("Прочее");
    private final String name;

    TypeOfObject(String name) {
        this.name = name;
    }

    public static TypeOfObject fromString(String value) {
        for (TypeOfObject typeOfObject : TypeOfObject.values()) {
            if (typeOfObject.getName().equals(value)) {
                return typeOfObject;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
