package enums;

public enum HomeImprovement {
    ELEVATOR("Лифт"),
    RAMP("Пандус"),
    GARBAGECHUTE("Мусоропровод"),
    FENCEDAREA("Огороженная территория"),
    COVEREDPARKING("Парковка скрытая"),
    PARKING("Стояночное место"),
    INTERCOM("Домофон"),
    CCTV("Видеонаблюдение"),
    BASEMENT("Подвал");
    private final String name;

    HomeImprovement(String name) {
        this.name = name;
    }

    public static HomeImprovement fromString(String value) {
        for (HomeImprovement homeImprovement : HomeImprovement.values()) {
            if (homeImprovement.getName().equals(value)) {
                return homeImprovement;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
