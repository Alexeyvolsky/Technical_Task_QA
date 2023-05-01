package enums;

public enum TypeOfLayout {
    FREELAYOUT("Свободная планировка"), STUDIO("Студия");
    private final String name;

    TypeOfLayout(String name) {
        this.name = name;
    }

    public static TypeOfLayout fromString(String value) {
        for (TypeOfLayout typeOfLayout : TypeOfLayout.values()) {
            if (typeOfLayout.getName().equals(value)) {
                return typeOfLayout;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
