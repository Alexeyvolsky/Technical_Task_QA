package enums;

public enum Repair {
    REDECORATING("Косметический"),
    RENOVATION("Евро"),
    DESIGN("Дизайнерский"),
    BUILDINGFINISH("Строительная отделка"),
    WITHOUTFINISHING("Без отделки"),
    EMERGENCY("Аварийное состояние");
    private final String name;

    Repair(String name) {
        this.name = name;
    }

    public static Repair fromString(String value) {
        for (Repair repair : Repair.values()) {
            if (repair.getName().equals(value)) {
                return repair;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
