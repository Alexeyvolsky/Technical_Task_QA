package enums;

public enum Developer {
    A_100("А-100"), SE_UKS_OF_THE_CITY_OF_VITEBSK("ГП \"УКС города Витебска\""),
    SE_UKS_LENINSKY_DISTRICT("ГП \"УКС Ленинского района\""), SE_UKS_SMOLEVICHI_DISTRICT("ГП \"УКС Смолевичского района\""),
    STATE_ENTERPRISE_UKS_OF_THE_SOVIET_DISTRICT("ГП \"УКС Советского района\"");

    private final String name;

    Developer(String name) {
        this.name = name;
    }

    public static Developer fromString(String value) {
        for (Developer developer : Developer.values()) {
            if (developer.getName().equals(value)) {
                return developer;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
