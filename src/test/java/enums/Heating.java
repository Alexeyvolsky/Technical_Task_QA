package enums;

public enum Heating {
    GAS("Газовое"), CENTRAL("Центральное"), ELECTRICAL("Электрическое"), OVEN("Печное"), ABSENT("Отсутсвует");
    private final String name;

    Heating(String name) {
        this.name = name;
    }

    public static Heating fromString(String value) {
        for (Heating heating : Heating.values()) {
            if (heating.getName().equals(value)) {
                return heating;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
