package enums;

public enum Bathroom {
    SEPARATE("Раздельный"), COMBINED("Совмещенный"), TWO("Два"), THREE("Три");
    private final String name;

    Bathroom(String name) {
        this.name = name;
    }

    public static Bathroom fromString(String value) {
        for (Bathroom bathroom : Bathroom.values()) {
            if (bathroom.getName().equals(value)) {
                return bathroom;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
