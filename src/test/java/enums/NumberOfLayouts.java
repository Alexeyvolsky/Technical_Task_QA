package enums;

public enum NumberOfLayouts {
    ONE("1"), TWO("2"), THREE("3");
    private final String name;

    NumberOfLayouts(String name) {
        this.name = name;
    }

    public static NumberOfLayouts fromString(String value) {
        for (NumberOfLayouts numberOfLayouts : NumberOfLayouts.values()) {
            if (numberOfLayouts.getName().equals(value)) {
                return numberOfLayouts;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
