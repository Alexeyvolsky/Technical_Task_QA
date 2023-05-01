package enums;

public enum Facilities {
    V220("Электричество 220В"),
    V380("Электричество 220В"),
    WATER("Вода"),
    SECURITY("Круглосуточная охрана"),
    CCTV("Видеонаблюдение"),
    VIEWINGHOLE("Смотровая яма"),
    BASEMENT("Подвал"),
    AUTOMATICGATES("Автоматические ворота");
    private final String name;

    Facilities(String name) {
        this.name = name;
    }

    public static Facilities fromString(String value) {
        for (Facilities facilities : Facilities.values()) {
            if (facilities.getName().equals(value)) {
                return facilities;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
