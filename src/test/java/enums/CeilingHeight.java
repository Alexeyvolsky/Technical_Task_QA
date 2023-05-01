package enums;

public enum CeilingHeight {
    TWOANDHALF("от 2.5 м"), TWOANDSEVEN("от 2.7 м"), THREE("от 3 м"), THREEANDHALF("от 3.5 м"), FOURANDMORE("от 4 м");
    private final String name;

    CeilingHeight(String name) {
        this.name = name;
    }

    public static CeilingHeight fromString(String value) {
        for (CeilingHeight ceilingHeight : CeilingHeight.values()) {
            if (ceilingHeight.getName().equals(value)) {
                return ceilingHeight;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
